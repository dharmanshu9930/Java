#include<iostream>
#include<math.h>
using namespace std;
int main()
{
    float a,b,c,d,dis;
    cout<<"Enter a,b,c,d to find distance between points (a,b) and (c,d) ";
    cin>>a>>b>>c>>d;
    dis=sqrt(pow((a-c),2)+pow((b-d),2));
    cout<<" The Distance between given points is "<<dis;
    return 0;

}