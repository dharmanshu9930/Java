#include <iostream>
#include <vector>
#include <queue>
using namespace std;

class node
{
public:
    int data;
    node *left, *right;
    int height;
    static node *newnode(int x)
    {
        node *newnode = new node;
        newnode->data = x;
        newnode->left = newnode->right = NULL;
        newnode->height = 0;
        return newnode;
    }
};
int height(node *p)
{
    if (p)
        return p->height;
    return -1;
}
node *LLRotation(node *p)
{
    node *x = p->left;
    node *t = x->right;

    p->left = t;
    x->right = p;

    p->height = max(height(p->right), height(p->left)) + 1;
    x->height = max(height(x->right), height(x->left)) + 1;

    return x;
}
node *RRRotation(node *p)
{
    node *x = p->right;
    node *t = x->left;

    p->right = t;
    x->left = p;
    p->height = max(height(p->right), height(p->left)) + 1;
    x->height = max(height(x->right), height(x->left)) + 1;
    return x;
}

int bf(node *p)
{
    if (p)
        return height(p->left) - height(p->right);
    return -1;
}

class AVL
{
    node *root;
    node *add(node *p, int x)
    {
        if (p == NULL)
            return node::newnode(x);

        if (x < p->data)
            p->left = add(p->left, x);
        else if (x > p->data)
            p->right = add(p->right, x);

        p->height = max(height(p->right), height(p->left)) + 1;
        int balanceFactor = bf(p);
        if (balanceFactor == 2 && bf(p->left) == 1)
            return LLRotation(p);
        if (balanceFactor == -2 && bf(p->right) == -1)
            return RRRotation(p);
        if (balanceFactor == 2 && bf(p->left) == -1)
        {
            p->left = RRRotation(p->left);
            return LLRotation(p);
        }
        if (balanceFactor == -2 && bf(p->right) == 1)
        {
            p->right = LLRotation(p->right);
            return RRRotation(p);
        }
        return p;
    }
    void inorderTraversal(node *p)
    {
        if (p)
        {
            inorderTraversal(p->left);
            cout << p->data << " ";
            inorderTraversal(p->right);
        }
    }

public:
    AVL() { root = NULL; }
    void insert(int x)
    {
        root = add(root, x);
    }
    void inorderDisplay()
    {
        inorderTraversal(root);
    }
    node *getRoot() { return root; }
};

int main()
{
    AVL a;

    int n;
    cin >> n;
    int x;
    for (int i = 0; i < n; i++)
    {
        cin >> x;
        a.insert(x);
    }

    a.inorderDisplay();

    return 0;
}
