package Test;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        //Create a program to find the largest among three numbers using if-else statements.

        Scanner s=new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1=s.nextInt();
        System.out.println("Enter Second Number");
        int num2=s.nextInt();
        System.out.println("Enter Third Number");
        int num3=s.nextInt();

        if (num1==num2 && num2==num3)
        {
            System.out.println("All three number are equal");
        }
        else if (num1>=num2 && num1>=num3)
        {
            System.out.println(num1 +" "+  "is graetor");
        }
        else if (num2>=num3 && num2>=num1)
        {
            System.out.println(num2 +" "+  "is graetor");
        }
        else
        {
            System.out.println(num3 +" "+  "is graetor");
        }

s.close();
    }
}
