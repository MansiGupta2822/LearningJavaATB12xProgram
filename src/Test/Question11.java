package Test;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
//        Write a program to print numbers from 1 to N using a for loop.

        Scanner s= new Scanner (System.in);
        System.out.println("Enter the number");
        int N=s.nextInt();

        for(int i=1; i<=N; i++)
        {
            System.out.print(i + " ");
        }

    }
}
