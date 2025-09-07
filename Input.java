import java.util.*;

public class Input {
    public static void main(String[] args){
        System.out.println("Enter your Name");
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        String name = sc.nextLine();     // Some are many function in scan like nextInt() , nextFloat()
        System.out.println(name);
    }
}
