#include <iostream>
#include<bits/stdc++.h>

using namespace std;
int main(){

// string s("Lokesh Singh is my name");
// cout<<"The length of string is: "<<s.length()<<endl;
// cout<<s<<endl;
//  s.clear();
// cout<<"Printing string after clearing"<<s<<endl;
// cout<<"The length of string is after clearing : "<<s.length()<<endl;

// string h(5 ,'*');
// cout<<h<<endl;

// string s1("Lokesh ");
// string s2("Singh");
// s1.append(s2);
// cout<<s1<<endl;
// string s3 = s1.substr(0,6);
// cout<<s3<<endl;

string s1 = "Lokesh Singh is learning coding";
s1.erase(1,3);
cout<<s1<<endl;;
cout<<s1.find("learn")<<endl;;

return 0;
}