package ex_Interview_Coding_Questions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        //How to Take Input from Users?

        Scanner s=new Scanner (System.in);
        System.out.println("Enter the name");
        String name=s.nextLine();
        System.out.println("Enter your age");
        int age= s.nextInt();
        System.out.println("your name and age is:" + " " + name + " " + age);
        s.close();
    }



}
