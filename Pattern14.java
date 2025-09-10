public class Pattern14 {
    public static void main(String [] args){
        for(int x = 1 ; x<=4 ; x++ ){
            for(int y = 1 ; y<=4-x ; y++){
                System.out.print("  ");
            }
            for(int k =1 ; k<=2*x-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int x = 4; x>=1 ; x-- ){
            for(int y = 1 ; y<=4-x ; y++){
                System.out.print("  ");
            }
            for(int k =1 ; k<=2*x-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
