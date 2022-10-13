#include <iostream>
using namespace std;
int main(){
char a;
float x,y;
cout << "Enter Operator(+,-,*,/,%):";
cin  >>a;
cout <<"Enter the first Number:";
cin  >>x;
cout <<"Enter The second Number:";
cin  >>y;
switch(a) {
  case '+': cout <<x+y; break;
  case '-': cout <<x-y; break;
  case '*': cout <<x*y; break;
  case '/': cout <<x/y; break;
  case '%': cout <<x%y; break;
  default:  cout <<"Enter a valid operator"; break;
}
return 0;
}
