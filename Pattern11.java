public class Pattern11 {
    public static void main(String[] args){
        for(int x = 1 ; x<=5 ;x++){
            for(int y = 1; y<=5-x ;y++){
                System.out.print("  ");
            }
            for(int k =1 ; k<=5;k++){
                System.out.print("* ");
            }
           
            System.out.println();
        }
    }
}
