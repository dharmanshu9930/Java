import java.util.Scanner;
class Swap
{
public static void main (String[] args)
{
int a, b, temp=0;
Scanner kb= new Scanner(System.in);
       System.out.println("enter the first number : ");
       a=kb.nextInt(); 
       System.out.println("enter the second number : ");
       b=kb.nextInt();
       System.out.println("before swapping: "+a +   ""+b);
temp=a;
a=b;
b=temp;
System.out.println("after swapping a =  " +a+   ""+b);
System.out.println();
}}
