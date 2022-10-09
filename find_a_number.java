package packages;
import java.util.*;
public class find_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of matrix:");
        int rows= sc.nextInt();

        System.out.println("Enter the column of matrix:");
        int col = sc.nextInt();
        System.out.println("Enter the element you want to search in the matrix:");
        int x = sc.nextInt();
        int[][] numbers = new int[rows][col];

        System.out.println("Enter the matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                numbers[i][j]= sc.nextInt();
            }
        }

        System.out.println("Index of position where the element is found: ");
        for(int i=0;i<rows;i++){
            for(int j= 0;j<col;j++){
                if(numbers[i][j]==x){
                    System.out.println( i+ " ,"+j+" ");
                    break;
                }

            }
        }
    }

}
