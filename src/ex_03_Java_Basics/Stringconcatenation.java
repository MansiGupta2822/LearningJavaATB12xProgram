package ex_03_Java_Basics;

public class Stringconcatenation {
    public static void main(String[] args) {

//        Write a program that demonstrates string concatenation with different data types and operator precedence.

        int num1=5;
        int num2=10;
        String Result= "sum of num1 and num2";

        System.out.println(Result +num1+num2); // sum of num1 and num2510
        System.out.println(Result+ (num1+num2)); //sum of num1 and num215
        System.out.println(num1+num2+Result); //15sum of num1 and num2

    }
}
