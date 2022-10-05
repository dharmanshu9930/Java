#include<iostream>
using namespace std;

int main() {
    int a,b,c;
    cout<<"enter the value of a:";
    cin>>a;
    cout<<"enter the value of b:";
    cin>>b;
    cout<<"enter the value of c:";
    cin>>c;
    if((a>b) && (a>c)){
        cout<<"a is the greater number";
    }
    if((b>a) && (b>c)){
        cout<<"b is greater number";
}else{
       cout<<"c is greater number";
    }
    
       return 0;
}