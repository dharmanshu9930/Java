import java.util.*;
import java.io.*
public class Main 
{  
   public static void main(String[] args) 
   {  
       Scanner sc = new Scanner(System.in);  
     
       String r = ""; 
     
       String num = sc.nextLine(); 
     
       int length = num.length();
     
      for ( int i = length - 1; i >= 0; i-- )  
        
         r = r + num.charAt(i);  
      if (num.equals(r))  
         System.out.println("The entered string " +num +" is a palindrome.");  
      else  
         System.out.println("The entered string " +num +"  isn't a palindrome.");     
  }
} 
