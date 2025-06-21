package ex_05_Java_Basics;
import java.util.Scanner;

public class DoWhile_Scannerclass {
    public static void main(String[] args) {
        //Ask the user to enter a number between 1 and 10 (inclusive). Keep asking until they enter a valid number.

        Scanner s=new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter number between 1 to 10");
            num=s.nextInt();

        }while(num < 1 || num > 10);
        System.out.println("Your number is valid");
        s.close();

    }
}
