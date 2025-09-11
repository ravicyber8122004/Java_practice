/*
 2D Array declaration:

 type [][] arrayName = new type[rows][columns];
 int[][] numbers = new int[3][5]

 */

 import java.util.*;

public class TwoDArray {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int m = sc.nextInt();
        System.out.println("Enter the no. of columns");
        int n = sc.nextInt();
        int [][] _2D_Array = new int[m][n];
        System.out.println("Enter the elements of the array:");
        for(int x=0 ; x<m;x++){
            for(int y=0 ; y<n ; y++){
             _2D_Array[x][y] = sc.nextInt();
            }
        }
        System.out.println("Your Array is:");
        for(int x=0 ; x<m;x++){
            for(int y=0 ; y<n ; y++){
             System.out.print(_2D_Array[x][y] + " ");
            }
            System.out.println();
        }
        sc.close();
        

    }
}
