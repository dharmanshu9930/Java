class A
{
int i,j;
A(int a,int b)
{
i=a;
j=b;
}
void show() 
{
System.out.println("i="+i+"j="+j);
}
}
class B extends A
{
int k;
B(int a,int b,int c)
{
super(a,b);
k=c;
}
void show(String msg)
{
System.out.println(msg +k);
}
}
class Overridden 
{
public static void main(String ar[])
{
B subob=new B(1,2,3);
subob.show("this is k");
subob.show();
}
}
