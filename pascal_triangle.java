import java.util.Scanner; 
import java.util.ArrayList; 
public class pascal_triangle{
    public static void pascal(int numberofRow){
    int [][]pascal=new int [numberofRow][numberofRow + (numberofRow / 2)+1];
    int count = 0;
    for (int i = 0; i < numberofRow; i++)
    {
        for (int j = 0; j < numberofRow + (numberofRow / 2); j++)
        {

            if ((numberofRow / 2) == count && i == 0)
            {
                pascal[i][j] = 1;
            }
            else
            {
                pascal[i][j] = 0;
            }
            count++;
        }
    }
      for (int i = 1; i < numberofRow; i++)
        {
            for (int j = 1; j < numberofRow + (numberofRow / 2); j++)
            {
                pascal[i][j] = pascal[i - 1][j] + pascal[i - 1][j - 1]; // Taking help of the dynamic programming
            }
        }
    ArrayList<ArrayList<Integer> > trinagle
            = new ArrayList<ArrayList<Integer> >();
     for (int i = 0; i < numberofRow; i++)
    {
        ArrayList<Integer>a=new ArrayList<Integer>(); 
        for (int j = 0; j < numberofRow + (numberofRow / 2); j++)
        {
                if(pascal[i][j]!=0){
                    a.add(pascal[i][j]); 
                }
           
        }
        trinagle.add(a); 
    }
    for(int i = 0; i < trinagle.size(); i++){
          for(int j = 0; j < trinagle.get(i).size(); j++){
             System.out.print(trinagle.get(i).get(j)); 
          }
          System.out.println();
    }
    
    
 
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in); 
        int n=scan.nextInt(); 
        pascal(n); 
    }
}