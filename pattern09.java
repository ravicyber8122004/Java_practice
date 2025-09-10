public class pattern09 {
     public static void main(String [] args){
        int k =1;
        for(int i=1 ; i<=5;i++){
            if(i%2 ==0){
                k = 0;}
            else{
                k=1;
            }
            for(int j = 1 ; j<=i ; j++){
               
               
                
                    
                    System.out.print(k + " ");
                if(k==1){
                   k = 0;
                }
                else{
                    k = 1;
                }
                
                
            }
            System.out.println();
        }
    }
}
