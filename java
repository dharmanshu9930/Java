import java.io.*;
import java.lang.*;
import java.util.*;
public class Student {
int roll;
String firstname;
String lastname;
String name;
double marks;
Student(int roll,String firstname,String lastname,double marks){
this.roll = roll;
this.firstname = firstname;
this.lastname = lastname;
this.name = firstname+&quot; &quot;+lastname;
this.marks = marks;
}
static void showDetails(int n,Student[] s){
for(int i=0;i&lt;n;i++ ){
System.out.println(&quot;Name : &quot;+s[i].name);
System.out.println(&quot;Roll no : &quot;+s[i].roll);
System.out.println(&quot;Marks : &quot;+s[i].marks);
System.out.println(&quot;&quot;);
}
}
static void showTopStudents(int n,int x,Student[] s){
//Bubble sort
int i, j;
for (i = 0; i &lt; n - 1; i++)
for (j = 0; j &lt; n - i - 1; j++)
if (s[j].marks &gt; s[j + 1].marks){
Student temp;
temp = s[j];
s[j] = s[j+1];
s[j+1] =temp;
}
for(int k=n-1;k&gt;=n-x;k--){
System.out.println(&quot;Name :&quot;+s[k].name);
System.out.println(&quot;Rollno :&quot;+s[k].roll);
System.out.println(&quot;Marks :&quot;+s[k].marks);
System.out.println(&quot; &quot;);
}
}

static void showLowestStudent(Student[] s,int n){
// Arrays.sort(s,Student::compareThem);
//Bubble sort
int i, j;
for (i = 0; i &lt; n - 1; i++)
for (j = 0; j &lt; n - i - 1; j++)
if (s[j].marks &gt; s[j + 1].marks){
Student temp;
temp = s[j];
s[j] = s[j+1];
s[j+1] =temp;
}
System.out.println(&quot;Name &quot;+s[0].name);
System.out.println(&quot;Rollno &quot;+s[0].roll);
System.out.println(&quot;Marks &quot;+s[0].marks);
}
static void showSameStudents(Student[] s,int n){
for(int i=0;i&lt;n;i++){
for(int j=i+1;j&lt;n;j++){
if(s[i].firstname.equals(s[j].firstname)){
System.out.println(&quot;Name &quot;+s[i].name);
System.out.println(&quot;Rollno &quot;+s[i].roll);
System.out.println(&quot;Marks &quot;+s[i].marks);
System.out.println(&quot; &quot;);
System.out.println(&quot;Name &quot;+s[j].name);
System.out.println(&quot;Rollno &quot;+s[j].roll);
System.out.println(&quot;Marks &quot;+s[j].marks);
}
}
}
}
public static void main(String agrs[]){
System.out.print(&quot;Enter the number of students : &quot;);
Scanner obj = new Scanner(System.in);
int n = obj.nextInt();
Student[] s = new Student[n];
// // Testing cases
// s[0] = new Student(100,&quot;Ajay&quot;,&quot;Sharma&quot;,80.2);
// s[1] = new Student(101,&quot;Ajay&quot;,&quot;Garg&quot;,80.5);
// s[2] = new Student(102,&quot;Neha&quot;,&quot;Roy&quot;,80.6);
for(int i=0;i&lt;n;i++){
int r; String fa,la; double ma;
System.out.print(&quot;Enter the rollno : &quot;);
r = obj.nextInt();
System.out.print(&quot;Enter firstname : &quot;);
fa = obj.next();
System.out.print(&quot;Enter lastname : &quot;);
la = obj.next();
System.out.print(&quot;Enter marks : &quot;);
ma = obj.nextDouble();
s[i] = new Student(r,fa,la,ma);
}
int choice,x;
System.out.println(&quot;\nSelect&quot;);
System.out.println(&quot;1. ShowDetails&quot;);
System.out.println(&quot;2. ShowTopStudents&quot;);
System.out.println(&quot;3. ShowLowestStudents&quot;);
System.out.println(&quot;4. ShowSameStudents&quot;);
System.out.print(&quot;Enter choice : &quot;);
choice = obj.nextInt();
switch(choice){
case 1 :
System.out.print(&quot;\nEnter the number of students needed:
&quot;);
x = obj.nextInt();
showDetails(x,s); break;
case 2 :
System.out.print(&quot;\nEnter the number of students needed:
&quot;);
x = obj.nextInt();
showTopStudents(n,x,s); break;
case 3 : showLowestStudent(s,n); break;
case 4 : showSameStudents(s, n); break;
default : System.out.println(&quot;Invalid Choice&quot;); break;
}
}
}
