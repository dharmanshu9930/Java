class Babe implements Runnable
{
Thread t;
String Tname;
Babe(String name)
{
Tname=name;
t=new Thread(this,Tname);
System.out.println(t);
}
public void run()
{
try
{
for(int i=0;i<5;i++)
{
System.out.println(Tname +i);
Thread.sleep(1000);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
class Multithread
{
public static void main(String args[])
{
Babe t1=new Babe("One");
Babe t2=new Babe("Two");
Babe t3=new Babe("Three");
t1.t.start();
t2.t.start();
t3.t.start();
try
{
for(int i=0;i<5;i++)
{
//System.out.println("Parent Thread"+i);
Thread.sleep(1000);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}