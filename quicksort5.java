#include <stdio.h>
void swap(int *a,int *b)
{
	int temp;
	temp=*a;
	*a=*b;
	*b=temp; 
}

int partition(int a[],int l,int h)
{
	int i=l-1,j;
	int pivot=a[h];
	for(j=l;j<h;j++)
	{
		if(a[j]<pivot)
		{
				i++;
				swap(&a[i],&a[j]);
		}
	
	}
	swap(&a[i+1],&a[h]);
	return (i+1);
}

void quicksort(int a[],int l,int h)
{
	if(l<h)
	{
		int pi=partition(a,l,h);
		quicksort(a,l,pi-1);
		quicksort(a,pi+1,h);
	}
}

int main()
{
	int n;
	printf("\nENTER SIZE OF ARRAY : ");
	scanf("%d",&n);
	int a[n],i;
	printf("\nENTER %d ELEMENTS: ",n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("BEFORE SORTING:-");
	for(i=0;i<n;i++)
	{
		printf("%d ",a[i]);
	}

	quicksort(a,0,n-1);

	printf("AFTER SORTING:-");
	for(i=0;i<n;i++)
	{
		printf("%d ",a[i]);
	}
}
