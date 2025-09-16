/*
 Operation in the bit manipulation:-
 1. Get
 2. Set
 3. Clear
 4. Update
 */

public class BitManipulation {
    public static void main(String args[]){
        int n=5;
        int pos = 2;
        int bitMask = 1<<pos;

        if((bitMask & n) == 0){
           System.out.println("bit was zero");
        }
        else{
            System.out.println("bit was one");
        }
    }
}
