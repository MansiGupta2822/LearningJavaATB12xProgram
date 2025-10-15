package Test;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        //Write a Java program that demonstrates proper variable declaration and initialization for different data types.

        int a = 25;
        double b = 3.14;
        boolean c = true;
        char d = 'A';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        //Write a java program to find a string is palindrome or not?
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name");
        String s1 = s.next();
        boolean ispalindrome = true;


        for (int i = 0; i <= s1.length() / 2; i++) {
            if (s1.charAt(i) != s1.charAt(s1.length() - 1 - i)) {
                ispalindrome = false;
                break;
            }

        }
        if (ispalindrome) {
            System.out.println("Palindrome");

        } else {
            System.out.println("not psalindrome");
        }
// simple way to find number is palindrome

        String s2 = "madam"; // hardcoded for demo, can also take input

        if (isPalindrome(s2)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
        static boolean isPalindrome (String s2){
            for (int i = 0; i < s2.length() / 2; i++) {
                if (s2.charAt(i) != s2.charAt(s2.length() - 1 - i)) {
                    return false;
                }
            }
            return true;
        }
    }

