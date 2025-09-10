public class Pattern10 {
    public static void main(String [] args){
        for(int x= 1; x<=4;x++){
            for(int y = 1 ; y<=x ;y++){
                 System.out.print(" * ");
            }
            
            for(int y = 1 ; y<=8-2*x ;y++){
                 System.out.print("   ");
            }
            for(int y = 1 ; y<=x ;y++){
                 System.out.print(" * ");
            }
            System.out.println();
        }
        for(int x=4; x >=1;x--){
            for(int y = 1 ; y<=x ;y++){
                 System.out.print(" * ");
            }
            
            for(int y = 1 ; y<=8-2*x ;y++){
                 System.out.print("   ");
            }
            for(int y = 1 ; y<=x ;y++){
                 System.out.print(" * ");
            }
            System.out.println();
        }
        
       
    }
}
