#include <iostream>
using namespace std;
/*
syntax for intialization list in constructor:
constructor (argument-list) : intialization - section
{
    assignmnet+other code;
}
class test{
    int a;
    int b;
    public:
    test (int i , int j): a(i), b(j) 
    {cout<<"constructor body";}
};

*/
class test
{
    int a;
    int b;

public:
// Test(int i, int j) : a(i), b(j)
    // Test(int i, int j) : a(i), b(i+j)
    // Test(int i, int j) : a(i), b(2 * j)
    // Test(int i, int j) : a(i), b(a + j)
    // Test(int i, int j) : b(j), a(i+b) -->RED Flag this will create problems because a will be initialized first
    test(int i, int j) : a(i)
    {
        b = j;
        cout << "constructor executed" << endl;
        cout<<"The value of a is "<<a<<endl;
        cout<<"The value of b is "<<b<<endl;
    }
};
int main()
{
test t (4,6);

    return 0;
}