#include <iostream>
using namespace std;

int main()
{
    int a,b,c,d,p,q,r,x,y;
    cout<<"Enter the value of a: ";
    cin>>a;
    cout<<"Enter the value of b: ";
    cin>>b;
    cout<<"Enter the value of c: ";
    cin>>c;
    cout<<"Enter the value of p: ";
    cin>>p;
    cout<<"Enter the value of q: ";
    cin>>q;
    cout<<"Enter the value of r: ";
    cin>>r;
    x=(b*r-q*c)/(a*q-p*b);
    y=(p*c-r*a)/(a*q-p*b);
    cout<<"Point of intersection is ("<<x<<","<<y<<")";
    return 0 ;
}