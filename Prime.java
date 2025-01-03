import java.util.*;

public class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        boolean isPrime = true;
        int n = sc.nextInt();

        for(int divisor=2; divisor<n; divisor++ ){
            if(n%divisor==0){
                isPrime=false;
            }
        }

        if(isPrime){
            if(n==1){
                System.out.println("Neither Prime nor composite");
            } else{
                System.out.println("Prime No.");
            }
        }else{
            System.out.println("Not a Prime No.");
        }
    }
}
