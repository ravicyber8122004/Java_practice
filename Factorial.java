import java.util.*;
public class Factorial {
    public static int fact(int n){

    if (n==0){
        // System.out.println("Invalid Number");y
        return 1;
    }
    int factorial = 1;
    for (int i =n ;i>=1;i-- ){
        factorial = factorial*i;
    }
    return factorial;
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the num:");
       int num = sc.nextInt();
       int result = fact(num);
       sc.close();
       System.out.println("The Factorial of " + num + " is: " + result);
       
    }
}
