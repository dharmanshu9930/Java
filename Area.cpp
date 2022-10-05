#include<iostream>
#include<math.h>
using namespace std;
int main()
{
    float a,b,c,s,area;
    cout<<" Enter the Sides of the triangle";
    cin>>a>>b>>c;
    s=(a+b+c)/2;
    area=sqrt(s*(s-a)*(s-b)*(s-c));
    cout<<"The Area of the Triangle is "<<area;
    return 0;
    
}