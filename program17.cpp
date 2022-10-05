#include <iostream>
using namespace std;
int main()
{
    int i,j,k,l;
for(i=1;i<=5;i++) //outer loop is always used to change line
{
    for(j=4;j>=i;j--) //blanks triangle
    {
        cout<<" ";
    }
    for(k=1;k<=i;k++) //first triangle
    {
        cout<<"*";
    }
    for(l=2;l<=i;l++) // second triangle
    {
        cout<<"*";
    }
    cout<<endl;
}
return 0;
}