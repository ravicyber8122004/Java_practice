import java.util.*;
public class user_define_array {
    public static void main(String args[]){
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the size of the array");
           int n = sc.nextInt();
           int nums[] = new int[n];
           System.out.println("Enter the Elements of the arrray:");
           for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
           }
           System.out.println("Enter the value which you want to find in the array: ");
           int f = sc.nextInt();
           for(int i=0;i<n;i++){
            if(nums[i]==f){
               System.out.println("Element is: "+ (i+1));
               return ;
            }
            else{
                System.out.println("Element are not present in the array");
            }
           }
    }
}
