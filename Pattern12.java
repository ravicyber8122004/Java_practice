public class Pattern12 {
 public static void main(String [] args){
    for(int x = 1 ; x<=5 ; x++){
        for(int y = 1 ; y <= 5-x ; y++){
            System.out.print(" ");
        }
        for(int k =1 ; k<=x ; k++){
            System.out.print(x + " ");   
        }
        System.out.println();
    }
 }
}
