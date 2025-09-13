import java.util.*;
public class String_builder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("TonyStark");
        System.out.println(sb);

        //  for the get character
        System.out.println(sb.charAt(0));
    
        //  for replace the character
        sb.setCharAt(0 , 'p');
        System.out.println(sb);

        //  for insert an character in the string
        sb.insert(0 , 'S');
        System.out.println(sb);

        //  for delete the character 
        sb.delete(2,3);
        System.out.println(sb);

        // for add the char at end of the string
        sb.append("a");
        System.out.println(sb);

        //  for finding the length of the string
        System.out.println(sb.length());
    }
}
