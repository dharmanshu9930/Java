#include <iostream>

using namespace std;

int main()
{
    int n;
    cin>>n;

    int sum=0;
    int r=0;

    while (n>=10)
    {
        r=n%10;
        n/=10;
        sum+=r;
    }

    sum+=n;

    cout<<sum;

    return 0;
}