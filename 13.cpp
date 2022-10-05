#include<iostream>
using namespace std;
int main(){
    int i,n,count;
    cout<<"Enter the value of i";
    cin>>i;
    if(n<2){
        cout<<"Not prime not composite";
    }
    else if(n==2){
        cout<<"Number is prime"<<endl;
    }
    else{
    for(i=2;i<=n-1;i++)
    {if(n%1==0) {count++;}}
    if(count>0)
    {cout<<"Number is not a prime number"<<endl;}
    else{cout<<"Number is a prime number";}
    }
    return 0;
}