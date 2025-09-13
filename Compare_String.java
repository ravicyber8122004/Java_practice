public class Compare_String  {
    public static void main(String [] args){
        // compare
        String Name1 = "Tony";
        String Name2 = "Tony";
         
        // !. s1>s2  : +ve value
        // 2. s1 == s2 : 0
        // 3. s1<s2  : -ve value
          
        if(Name1.compareTo(Name2) == 0) {
            System.out.println("The strig are same");
        }
        else{
            System.out.println("String are not equal");
        }

        if(Name1 == Name2){
            System.out.println("The strig are same");
        }

        //  In the following , String is define by new methot , if condition compare method are not work , so we are use the :-
        // str1.compareTo(str2)

        if(new String("Tony") == new String("Tony")){
            System.out.println("String are same ");
        }
        else{
            System.out.println("String are not same ");
        }
    }
}
