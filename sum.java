import java.util.Scanner;
class ProblemSolution{
   int ProblemSolution(int N1,int N2){
    return (N1+N2);
   }
   int ProblemSolution(int N1,int N2,int N3){
    return (N1+N2+N3);
}}
class question1 {
    public static void main(String[] args) {
        ProblemSolution a=new ProblemSolution();
        Scanner sc=new Scanner(System.in);
        int N1=sc.nextInt();
        int N2=sc.nextInt();
        int N3=sc.nextInt();
        System.out.println("The sum of first 2 numbers is : "+a.ProblemSolution(N1, N2)); 
        System.out.println("The sum of first 3 numbers is : "+a.ProblemSolution(N1, N2, N3));
    }
}
