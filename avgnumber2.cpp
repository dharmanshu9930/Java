#include<iostream>
//#include<studio.h>
using namespace std;



int main()
{
    int i,n,Sum=0,numbers;
  float Average;

  printf("\nPlease Enter How many Number you want?\n");
  scanf("%d",&n);

  printf("\nPlease Enter the elements one by one\n");
  for(i=0;i<n;i++)
   {
     scanf("%d",&numbers);
     Sum = Sum +numbers;
   }

  Average = Sum/n;

  printf("\nSum of the %d Numbers = %d",n, Sum);
  printf("\nAverage of the %d Numbers = %.2f",n, Average);

  return 0;
}
  
