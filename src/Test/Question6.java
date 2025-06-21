package Test;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
//Write a program to check if a number is positive, negative, or zero.

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value");
        int num = s.nextInt();

        if (num==0)
        {
            System.out.println("Number is Zero");
        }
        else if (num>0)
        {
            System.out.println("You have entered a positive number");
        }
        else {
            System.out.println("Negative Number");
        }


    }
}
