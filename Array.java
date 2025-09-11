/*
 Define array :
 type [] arrayName = new type [size]
 type arrayName[] = new type [size]

 type arrayName[] ={item1 , item2 , item 3......}

 */


public class Array {
  public static void main(String[] args){
    // int [] marks = new int[3];
    int marks[] = new int[3];
    
    marks[0] = 97;
    marks[1] = 87;
    marks[2] = 67;
    // System.out.println(marks[0]);
    // System.out.println(marks[1]);
    // System.out.println(marks[2]);

    for(int i =0 ; i<3 ; i++){
        System.out.println(marks[i]);
    }
  }   
}
