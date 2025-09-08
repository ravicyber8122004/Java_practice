import java.util.*;
public class Switch_concept {
    public static void main(String [] args){
        System.out.println("Enter your choice : \n1 for Hyy \n2 for Hello \n3 for Love❤️ ");
        Scanner sc = new Scanner(System.in);
        int select = sc.nextInt();
        switch(select){
            case 1:
            System.out.println("Hyy Friend !");
            break;
            case 2:
            System.out.println("Hello Friend !");
            break;
            case 3:
            System.out.println("Love Bird ❤️");
            break;
            default:
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}
