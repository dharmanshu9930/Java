#include <iostream>

using namespace std;

int main()
{
    float a,b,c;
    cin>>a>>b>>c;

    cout<<"Line: "<<a<<"x + "<<b<<"y + "<<c<<" = 0"<<endl;
    float slope=-a/b;
    cout<<slope;

    return 0;
}