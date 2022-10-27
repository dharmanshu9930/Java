import java.util.Scanner;
public class Student
{
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int ROW = 4, COL = 4, sum = 0; 
	int m[][] = new int[ROW][COL];
	for (int i = 0; i < ROW; i++)
	for (int j = 0; j < COL; j++) 
	m[i][j] = input.nextInt();
	System.out.println ();
	for (int i = 0; i < ROW; i++) 
	{
	for (int j= 0; j < COL; j++) 
	{
	if( i ==j)
	sum += m[i][j];
	}
	}
	System.out.println ("Sum of 1st diagonal is" + sum);
	System.out.println ();
	for (int i = 0; i < ROW; i++) 
	{
	for (int j= 0; j < COL; j++) 
	{
	if( (i +j) == (ROW-1))
	sum += m[i][j];
	}
	}
	System.out.println ("Sum of 2nd diagonal is" + sum);
}
	}
