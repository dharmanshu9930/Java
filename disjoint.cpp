#include <bits/stdc++.h>
using namespace std;

class DSU {
	int *rank, *parent, n;

public:

	DSU(int n)
	{
		rank = new int[n];
		parent = new int[n];
		this->n = n;
		makeSet();
	}

	void makeSet()
	{
		for (int i = 0; i < n; i++) {
			parent[i] = i;
		}
	}

	int find(int x)
	{
		if (parent[x] != x) {

			parent[x] = find(parent[x]);
		}

		return parent[x];
	}

	void Union(int x, int y)
	{
		int xset = find(x);
		int yset = find(y);

		if (xset == yset)
			return;

		if (rank[xset] < rank[yset]) {
			parent[xset] = yset;
		}
		else if (rank[xset] > rank[yset]) {
			parent[yset] = xset;
		}

		else {
			parent[yset] = xset;
			rank[xset] = rank[xset] + 1;
		}
	}
};

int main()
{

	DSU obj(6);
	obj.Union(1, 3);
	obj.Union(5, 3);
	obj.Union(4, 2);

	if (obj.find(5) == obj.find(1))
		cout << "Yes,they have same parents.\n";
	else
		cout << "No,different parents hence different sets.\n";
	if (obj.find(2) == obj.find(1))
		cout << "Yes,they have same parents.\n";
	else
		cout << "No,different parents hence different sets.\n";

	return 0;
}
