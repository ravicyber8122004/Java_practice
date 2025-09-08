import java.util.*;
public class odd_even {
    public static void main(String [] args){
        System.out.println("Enter the no. :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num %2 ==0){
            System.out.println("The Given number is even");
        }
        else{
            System.out.println("The Given no. is odd ");
        }
        sc.close();
    }
}
