#include <iostream>
using namespace std;

void printArray(int a[][100] , int n , int m) 
{
   for (int i = 0; i < n; i++)
   {
       for (int j = 0; j < m; j++)
       {
       cout << a[i][j] <<"\t";
       }
       cout << endl;
       
   }    
   
} 

int main()
{
    int a[100][100], n , m;
    cout << "Enter the number of rows of array : ";
    cin >> n;
    cout << "Enter the numbers of coloumns of array : ";
    cin>>m ;

    cout << "Enter the array elements :";

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
        cin >> a[i][j];
        }
        
    }

    printArray(a , n , m);

    return 0;
}