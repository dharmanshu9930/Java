#include <iostream>
#include <cmath>
using namespace std;
int main(){
  int a;
  cout<<"enter year ";
  cin>>a;
  if(a%4==0||a%400==0){
      cout<<a<<" is a leap year";
  }
  else{
      cout<<a<<" is not a leap year";
  }
  return (0);
}
