package ex_05_Java_Basics;
import java.util.Scanner;

public class While_usingScannerclass {
    public static void main(String[] args) {
//        Keep asking 0 the user to enter numbers until they enter 0.
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number (enter 0 to exit)");
        int num = s.nextInt();

        while(num!=0){
            System.out.println("You Entered:"+ num);
            System.out.println("Enter the correct number");
            num=s.nextInt();
        }
        System.out.println("Loop Terminates as you have entered zero");
        s.close();



    }
}
