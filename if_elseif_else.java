import java.util.*;

public class if_elseif_else {

    public static void main(String [] args){
        System.out.println("Enter your choice : \n1 for Hyy \n2 for Hello \n3 for Love❤️ ");
        Scanner sc = new Scanner(System.in);
        int select = sc.nextInt();
        if (select == 1){
            System.out.println("Hyy Friend !");
        }
        else if (select ==2){
            System.out.println("Hello Friend!");
        }
        else if (select == 3){
            System.out.println("Love Bird ❤️");
        }
        else{
            System.out.println("Invalid choice");
        }
        sc.close();
    }
    
}
