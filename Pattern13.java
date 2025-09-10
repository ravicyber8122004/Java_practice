public class Pattern13 {
    public static void main(String [] args){
        for(int x = 1 ; x <= 5 ; x++){
            for(int y = 1 ; y <= 5-x;y++){
                System.out.print(" ");
            }
            int p = x;
            for(int k=1 ; k< x ; k++){
                System.out.print(p);
                p--;
            }
            for(int q = 1 ; q<2; q++){
                System.out.print(1);
            }
            p = 2;
            for(int k=1 ; k<= x -1 ; k++){
                
                System.out.print(p);
                p++;
            }
            
            System.out.println();
        }
    }
}
