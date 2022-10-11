#include <bits/stdc++.h>
using namespace std;
int add (int num1 ,int num2){
int sum = num1 + num2 ;
return sum ;
}


int main()
{   int a , b ;
    cout << "Enter the a : ";
    cin>> a ;
    cout << "Enter the b : ";
    cin>> b ;
    cout<< "The sum of --> ";
    cout<< add(a,b) << endl ;
     
    return 0;
}