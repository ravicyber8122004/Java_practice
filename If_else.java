import java.util.*;
public class If_else {
    public static void main(String [] args){
        System.out.println("Enter the age :");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("The man is adult , and his age is: " + age);
        }
        else{
            System.out.println("The man is not adult and his age is : "+ age);
        }
        sc.close();

    }
}
