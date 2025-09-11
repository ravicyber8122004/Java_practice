/*  
  Function Define:-
  returnType functionName(type arg1 , type arg , ......){
  //   definition 
  //   logic
  }

  normally we are use in java , camelcase written style
  eg. printMyName
  
  */

import java.util.*;
public class Functions {
    public static void printMyName(String Name){
        System.out.println("My Name is :" + Name);
    }
    public static void main(String [] args){
        System.out.println("Enter Name:");
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        printMyName(Name);
        sc.close();
    }
}
