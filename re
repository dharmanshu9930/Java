// Recursive Java program to check if the number is palindrome or not
import java.io.*;
 
class Palimdrome
{
 
// recursive function that returns the reverse of digits
static int rev(int n, int temp)
{
    // base case
    if (n == 0)
        return temp;
 
    temp = (temp * 10) + (n % 10);
 
    return rev(n / 10, temp);
}

public static void main (String[] args)
{
    int n = 121;
    int temp = rev(n, 0);
     
    if (temp == n)
        System.out.println("yes");
    else
        System.out.println("no" );
}
}
