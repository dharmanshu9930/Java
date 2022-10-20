


#include<iostream>
using namespace std;
int main ()
{
    int arr[10], n, i, max, min;
    cout << "Enter the size of the array : ";
    cin >> n;
    for (i = 0; i < n; i++)
    {
        cout << "Enter the value of " << i << " th element : ";
        cin >> arr[i];
    }
    
    min = arr[0];
    for (i = 0; i < n; i++)
    {
        if (min > arr[i])
            min = arr[i];
    } cout<<"the smallest elment="<<min;
    return 0;
}
