#include <iostream>
using namespace std;
class Stack{
public:
int top;
int *arr;
int size;
Stack(int n){
top=-1;
arr=new int[n];
size=n;
}
void push(int val){
    if(top>=size){
        cout<<"Stack Overflow"<<endl;
        return;
    }
    top++;
    arr[top]=val;
}
void pop(){
    if(top==-1){
        cout<<"Stack Underflow"<<endl;
        return;
    }
    top--;
}
void print(){
    if(top==-1){
        cout<<"Stack Underflow"<<endl;
        return;
    }
    int k=top;
    while(k>=0){
        cout<<arr[k]<<" ";
        k--;
    }
}
};
int main(){
Stack s(5);
s.print();
s.push(5);
s.push(10);
s.print();
s.pop();
s.push(15);
s.print();
return 0;
}