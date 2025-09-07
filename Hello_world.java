public class Hello_world {
    public static void main(String[] args){
        System.out.println("Hello world");
        System.out.print("hello World \n");         // we can use the ln , \n for change the line 
    
        System.out.println(" * \n ** \n *** \n **** \n");
    }
    
}

/* 
 
1. public class print {

public → access modifier, meaning this class can be accessed from anywhere.

class → keyword used to declare a class in Java.

print → the class name (user-defined).

⚠️ In Java, by convention, class names should start with a capital letter (Print instead of print) for readability and standard practice.

2. public static void main(String[] args){

This is the main method – the entry point of any Java program.

public → accessible everywhere (JVM needs access to run it).

static → JVM can call this method without creating an object of the class.

void → return type (means this method doesn’t return any value).

main → method name (fixed by Java – JVM looks for this method to start execution).

String[] args → command-line arguments (you can pass values when running the program).

3. System.out.println("Hello world");

System → built-in Java class that deals with system-related utilities.

out → a static object of PrintStream class (represents standard output, usually the console).

println() → method used to print text to the console and move to the next line.

 */