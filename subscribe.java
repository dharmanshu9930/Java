// import  java.util.Scanner;
// public class subscribe{
//     public static void main(String[] args){
        
//     int age;
//     System.out.println("Enter your age");
//     Scanner sc =new Scanner(System.in);
//     age = sc.nextInt();
//     //  if(age>56){
//     //     System.out.println("you are experienced");
//     //  }
//     //  else if(age>46){
//     //     System.out.println("You are semi experienced");
//     //  }
//     //  else{
//     //     System.out.println("you are not experienced");
//     //  }
//     switch(age){
//         case 18:
//         System.out.println("you are going to be an adult");
//         break;
//         case 23:
//         System.out.println("you are going to be young");
//         break;
//         case 60:
//         System.out.println("you are going to be old");
//         break;
//         default:
//         System.out.println("enjoy life");
//         break;
//     }
//     }
// }
// import java.util.Scanner;
// public class subscribe{
//     public static void main(String[] args){
//     int x=2;
//     int y;
//     System.out.println("Enter value of y:");
//     Scanner sc = new Scanner(System.in);
//     y = sc.nextInt(); 
//     switch(y){ 
//     case 0 : 
//     System.out.println('1');                
//     break; 
//     case 1 : 
//     System.out.println(x); 
//     break; 
//     case 2 : 
//     System.out.println( x * x);                
//     break; 
//     case 3 : 
//     System.out.println( x * x * x );                
//     break; 
//     case 4 : 
//     System.out.println( x * x * x * x);               
//     break; 
//     default : 
//     System.out.println("No match exists.");
//     } 
//     }
// }
// import java.util.Scanner;
// public class subscribe{
//     char LetterGrade; 
//     public static void main(String[] args){
//     System.out.println("Enter lettergrade");
//     Scanner sc = new Scanner(System.in); 
//     char LetterGrade = sc.next().charAt(0);
//     switch (LetterGrade) {     
//     case 'a' : 
//     case 'A' : System.out.print( "Excellent");                 
//     break;     
//     case 'b' : 
//     case 'B' : System.out.print("Superior");                
//     break;     
//     case 'C' : 
//     case 'c' : System.out.print("Average");                
//     break;     case 'd' : 
//     case 'D' : System.out.print(" Poor");                
//     break;     
//     case 'f' : 
//     case 'F' : System.out.print( " Try again");                
//     break; 
//     default : System.out.print("This is not a recognized letter grade.");
// } 
//     }
// }
// import java.util.Scanner;
// public class subscribe{
//     public static void main(String[] args){
// char What; 
// System.out.println("Enter lettergrade");
//   Scanner sc = new Scanner(System.in); 
//   What = sc.next().charAt(0);
// switch (What) {     
//     case 'c' :     
//     case 'C' : System.out.print(" Bobo ");     
//     case 'y' : 
//     case 'P' : System.out.print(" Is a Dog ");               
//     break;     
//     case 'x' :     
//     case 'X' : System.out.print(" Try But ");     
//     case 'z' : 
//     case 'Z' : System.out.print(" Cannot");     
//     default : System.out.print(" Help You.");
// } 
// }
// }
// import java.util.Scanner;
// public class subscribe{
//     public static void main(String[] args){
//     int Year; 
//     System.out.println("Enter your age");
//     Scanner sc =new Scanner(System.in);
//     Year = sc.nextInt();
//     // if (Year == 1) 
//     // System.out.print(" Freshman "); else if (Year == 2) 
//     // System.out.print(" Sophomore ");
//     // else if (Year == 3) 
//     // System.out.print(" Junior "); 
//     // else if (Year == 4) 
//     // System.out.print(" Senior "); 
//     // else 
//     // System.out.print(" Graduate "); 
//     switch(Year){
//         case 1:
//         System.out.println("Freshman");
//         break;
//         case 2:
//         System.out.println("Sophomore");
//         break;
//         case 3:
//         System.out.println("Junior");
//         break;
//         case 4:
//         System.out.println("Senior");
//         break;
//         default:
//         System.out.println("Graduate");
//     }
// }
// }
// import java.util.Scanner;
// public class subscribe{
//      static void gp(int a,int r,int n){
//           int current_term;
//           for(int i=0;i<n;i++){
//                current_term=a*(int)Math.pow(r,i);
//                System.out.println(current_term+" ");
//           }
//      }
//      public static void main(String[] args){
//           int a,r;
//           System.out.println("Enter value of first term");
//           Scanner sc=new Scanner(System.in);
//           a=sc.nextInt();
//           System.out.println("Enter value of common ratio");
//           Scanner rc=new Scanner(System.in);
//           r=rc.nextInt();
//           int n=15;
//           gp(a,r,n);
//      }
// }
// import java.util.Scanner;
// public class subscribe{
//      public static void main(String[] args){
//           int first_term=0;
//           int second_term=1;
//           int n;
//           System.out.println("Enter the number till which the series is to be printed: ");
//           Scanner sc = new Scanner(System.in);
//           n=sc.nextInt();
//           System.out.println(first_term+ "  ");
//           System.out.println(second_term+ "  ");
//           for(int i=0;i<n;i++){
//                int next_term=first_term+second_term;
//                System.out.println(next_term+ "  ");
//                first_term=second_term;
//                second_term=next_term;
//           }
//      }
// }
// import java.util.Scanner;
// public class subscribe{
//      public static boolean isPrime(int p){
//           for(int i=2; i<p; i++){
//             if(p%i==0)
//                return false;
//           }
//           return true;
//       }     public static void main(String[] args){
//          int p;
//          System.out.println("Enter the value till which prime numbers should be printed: ");
//          Scanner sc =new Scanner(System.in);
//          p=sc.nextInt();
//          int i;
//           for(i=2;i<=p;i++){
//           if(isPrime(i)){
//                System.out.println(i+" ");
//           }
//          }
//      }
// }