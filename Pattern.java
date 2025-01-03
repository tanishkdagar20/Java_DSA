public class Pattern {
    public static void main(String[] args) {
        /*for(int i=1; i<=4; i++){
            for(int j=1; j<=5; j++){
            System.out.print("*");
            }
            System.out.println();
        }
        *****    
        *****
        *****
        *****
        */
        /*for(int i=1; i<=4; i++){
            for(int j=1; j<=5; j++){
                if (i==1 || j==1 || i==4 || j==5) {
            System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
            System.out.println();
    }
            *****
            *   *
            *   *
            *****
            */
        /*for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        *
        **
        ***
        ****
        */
        /*for(int i=4; i>= 1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        ****
        ***
        **
        *
        */
        
                int val = 8;
                for (int i = 1; i <= val; i++) {
                    for (int j = 1; j <= val - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            
         
        }
}

