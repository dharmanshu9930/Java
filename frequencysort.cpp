#include <stdio.h>
#define MAX 256
int main ()
{
  int arr[MAX][2], brr[MAX][2];
  int k = 0, n, temp, count;
  //Initialize array size
  printf ("\nEnter the number of elements:\n");
  scanf ("%d", &n);
  //Initialize array elements 
  printf ("\nEnter the array elements :\n");
  for (int i = 0; i < n; i++)
    {
      scanf ("%d", &arr[i][0]);
      arr[i][1] = 0;
    }
  // Unique elements and its frequency are stored in another array
  for (int i = 0; i < n; i++)
    {
      if (arr[i][1])
	continue;
      count = 1;
      for (int j = i + 1; j < n; j++)
	{
	  if (arr[i][0] == arr[j][0])
	    {
	      arr[j][1] = 1;
	      count++;
	    }
	}
      brr[k][0] = arr[i][0];
      brr[k][1] = count;
      k++;
    }
  n = k;
  //Print the elements and its frequency
  printf ("\nArray Elements and its frequency:\n");
  printf (" \nElements   Frequency\n");
  for (int i = 0; i < n; i++)
    {
      printf ("   %d          %d \n", brr[i][0], brr[i][1]);
    }
  //Store the array and its frequency in sorted form
  for (int i = 0; i < n - 1; i++)
    {
      temp = brr[i][1];
      for (int j = i + 1; j < n; j++)
	{
	  if (temp < brr[j][1])
	    {
	      temp = brr[j][1];
	      brr[j][1] = brr[i][1];
	      brr[i][1] = temp;

	      temp = brr[j][0];
	      brr[j][0] = brr[i][0];
	      brr[i][0] = temp;
	    }
	}
    }
  //Print the sorted array and its frequency
  printf ("\nSorted Array Elements based on their frequency:\n");
  printf (" Elements   Frequency\n");
  for (int i = 0; i < n; i++)
    {
      printf ("   %d          %d    \n", brr[i][0], brr[i][1]);
    }
  //Print the sorted array based on its frequency
  printf ("\n Sorted Array based on its frequency:\n");
  for (int i = 0; i < n; i++)
    {
      while (brr[i][1] != 0)
	{
	  printf (" %d  ", brr[i][0]);
	  brr[i][1]--;
	}
    }
  return 0;
}