import java.util.*;
public class Strings02 {
    public static void main(String args[]){
        // concatenation
        String firstName = "Tony";
        String lastName = "stark";
        String fullName = firstName +" "+ lastName;
        System.out.println(fullName);

        //  for find out the length 
        System.out.println(fullName.length());

        // char At:
        for (int i=0 ; i<fullName.length();i++){
             System.out.println(fullName.charAt(i));
        }
    }
}
