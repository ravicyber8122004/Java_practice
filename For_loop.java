import java.util.*;
class For_loop {
    public static void main(String [] args){
       System.out.println("Enter the no.");
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       for(int i=0;i<=10;i++){
          System.out.println(i + " * " + num + " = " + i*num);
       }
       sc.close();
    }
}
