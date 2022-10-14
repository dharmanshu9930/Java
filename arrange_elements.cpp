#include <iostream>
using namespace std;
int main()
{
    int n=6;
    int a[n];
    int odd=1;
    int even=2;
    for(int i=0;i<=(n-1)/2;i++)
    {
        a[i]=odd;
        odd=odd+2;
    }
    for(int i=n-1;i>=((n-1)/2)+1;i--)
    {
        a[i]=even;
        even=even+2;
    }
    
    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<" ";
    }
    return 0;
}