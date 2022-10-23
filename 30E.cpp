// Program to find largest of four numbers
//  Write a program to findthe greatest of three given integers.
#include <iostream>
using namespace std;
int main()
{

    int a, b, c, d;

    cout << "Enter the value of 'a' : " << endl;
    cin >> a;
    cout << "Enter the value of 'b' : " << endl;
    cin >> b;
    cout << "Enter the value of 'c' : " << endl;
    cin >> c;
    cout << "Enter the value of d : " << endl;
    cin >> d;

    if (a > b && a > c && a > d)
    {
        cout << "a is the greatest" << endl;
    }

    if (b > c && b > a && b > d)
    {
        cout << "b is the greatest" << endl;
    }

    if (c > a && c > b && c > d)
    {
        cout << "c is the greatest" << endl;
    }

    if (d > a && d > b && d > c)
    {
        cout << "d is greatest" << endl;
    }

    return 0;
}