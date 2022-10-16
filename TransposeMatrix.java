//LEETCODE PROBELM-https://leetcode.com/problems/transpose-matrix/

//PROBLEM STATEMENT-Given a 2D integer array matrix, return the transpose of matrix.The transpose of a matrix is the matrix flipped
//over its main diagonal, switching the matrix's row and column indices.

//INPUT- { {1, 3, 4}, {2, 4, 3}, {3, 4, 5} }
//OUTPUT-{ {1, 2, 3}, {3, 4, 4}, {4, 3, 5} }

//CODE-

import java.util.*;

public class TransposeMatrix{

    public static void main (String args[]){
        //creating a matrix  
        int original[][] = { {1, 3, 4}, {2, 4, 3}, {3, 4, 5} };


        //creating another matrix to store transpose of a matrix  
        int transpose[][] = new int[3][3];	//3 rows and 3 columns  

        //Code to transpose a matrix  
        for (int i = 0; i < 3; i++){
	        for (int j = 0; j < 3; j++){
	            transpose[i][j] = original[j][i];
	        } 
        } 

        System.out.println ("Printing Matrix without transpose:");

        for (int i = 0; i < 3; i++){
	        for (int j = 0; j < 3; j++){
	            System.out.print (original[i][j] + " ");
	        } 
            System.out.println ();	//new line    
        } 

        System.out.println ("Printing Matrix After Transpose:");

        for (int i = 0; i < 3; i++){
	        for (int j = 0; j < 3; j++){
	            System.out.print (transpose[i][j] + " ");
	        } 
            System.out.println ();	//new line    
        } 
    }

}
