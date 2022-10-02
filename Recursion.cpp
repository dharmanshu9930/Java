#include <bits/stdc++.h>
using namespace std;
/* Tower of Hanoi
void TowerofHanoi(int n, char A, char B, char C)
{
    if (n == 1)
    {
        cout << "Moving the disk from " << A << " to " << C << endl;
        return;
    }
    TowerofHanoi(n - 1, A, C, B);
    cout << "Shift disk from" << A << " to " << B << endl;
    TowerofHanoi(n - 1, B, A, C);
}
int main()
{
    char a = '1';
    char b = '2';
    char c = '3';
    TowerofHanoi(3, a, b, c);
    return 0;
}*/

/*Check sorted array using recursion
int checkarray(int a[], int n)
{
    if (n == 1)
        return;
    return (a[n - 1] < a[n - 2]) ? 0 : checkarray(a, n - 1);
}*/
