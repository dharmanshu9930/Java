#include <iostream>

using namespace std;

int main()
{
    char c;
    cin.get(c);
    int x=c;
    int countc=0;
    int countd=0;
    int counts=0;

    while (c!='$')
    {
        int x=c;
        if (x>=97 && x<=122)
        {
            countc++;
        }
        if (x>=48 && x<=57)
        {
            countd++;
        }
        if (x==32 || x==9 || x==13)
        {
            counts++;
        }
        
        cin.get(c);
       
    }

    cout<<countc<<" "<<countd<<" "<<counts;

    return 0;
}