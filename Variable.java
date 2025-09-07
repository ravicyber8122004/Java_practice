/*
 
Data type in java :- define about types of data , and define about the variable memory size
types of data :- 
Primitive :- 8 types
int - 4 byte
long - 8 byte
float     - 4 byte
double   - 8 byte
char    - 2 byte
boolean - 1byte
byte   - 1byte
short

Non primitive datatype:-
String
Array
Class
object 
interface


variables :- A variable in Java is a named storage location in memory that holds a value.
 */


public class Variable {
    public static void main(String [] args){
        int a = 10 ;
        int b = 20 ;
        int sum = a + b ;
        System.out.println(sum);
        int diff = b-a;
        System.out.println(diff);
        int mul= a*b;
        System.out.println(mul);
    }
}
