import java.util.*;
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int n=2; n<x; n++){
            if(x%n == 0){
                System.out.println("not a prime no.");
            }
            else if(x%n != 0){
                System.out.println("prime no.");
            }
        }
    }

}
