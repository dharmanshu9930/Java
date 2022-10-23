# include<stdio.h>
int main()
{
int n=0;
printf("enter a num");
scanf("%d",&n);
int a=0;
printf("enter the num whose frequency is to be checked");
scanf("%d",&a);
int r=0;
int c=0;
while(n>0)
{
r=n%10;
if(r==a)
{
 c=c+1;
}
n=n/10;
}
printf("%d",c);
}
