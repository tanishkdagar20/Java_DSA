// we use import java.util.* for taking input in the program
import java.util.*;

public class InputOutput {
    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        //nextLine used to print multiple words
        //next used to print single word
        //nextInt for integers and so on
        System.out.println(name);
        //name simply used to print the value of variable
        //if with "",  "name" then print will be name
        System.out.println("name");
    }
}*/
// Ques. to take two inputs and print their sum
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;

        System.out.println(sum);
    }*/




    //Ques. area of circle
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        final double PI = 3.14;
        
        System.out.print("Area of circle is:- ");
        System.out.println(radius*radius*PI);
    }
}