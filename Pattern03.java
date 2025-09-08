

import java.util.*;
public class Pattern03 {
    public static void main(String [] args){
        System.out.println("Enter the no. of row");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
