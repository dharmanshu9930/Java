#include <iostream>

using namespace std;

int main()
{
    cout<<"This program prints prime numbers till a specified number 'N'."<<endl;
    int N;
    cout<<"Enter value for N: ";
    cin>>N;

    int n=2;
    bool prime=true;

    while (n<=N)
    {

        if (prime==true)
        {
            cout<<n<<endl;
        }
        n++;
        int i=2;

        prime=true;

        while (i<n && prime==true)
        {
            if (n%i==0)
            {
                prime=false;
            }
            
            i++;

        }

    }

    return 0;
}