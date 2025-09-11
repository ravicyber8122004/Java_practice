import java.util.*;

public class Add_question {
    public static int sum(int a, int b){
        int sum = a+b ;
        return sum;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yhe value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        int result = sum(a,b);
        sc.close();
        System.out.println("Sum of " + a + " and " +  b +" is: "+ result);

    }
}
