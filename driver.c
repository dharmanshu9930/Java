#include<stdio.h>
void main()
{float r, q, a, d,na;
printf("enter rate:");
scanf("%f",&r);
printf("enter quantity:");
scanf("%f",&q);
a=r*q;
printf("total amount:%.2f\n",a);
d=a*10/100;
printf("discount:%.2f\n",d);
na=a-d;
printf("net amount:%.2f\n",na);
}\