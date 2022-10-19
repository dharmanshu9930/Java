#include<iostream>
using namespace std;
int main ()
{
    int n, i, pro = 1;
    cout << "Enter the size of the array : ";
    cin >> n;
  int arr[n];
    for (i = 0; i < n; i++)
    cin >> arr[i];
    for (i = 0; i < n; i++)
    {
        pro *= arr[i];
    }
    cout << "Product of array elements : " << pro;
    return 0;
}