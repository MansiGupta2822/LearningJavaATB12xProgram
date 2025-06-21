package Test;

public class Question5 {
    public static void main(String[] args) {
//        Write a program that demonstrates operator precedence and type casting in Java.
        int a=10;
        double b=3.5;

        double c=a;
        System.out.println("After implicit type casting the value is:"+ (b+c));

        int d=(int)b;
        System.out.println("After explicit type casting the value is:" + (a+d));

        int result= a * 2 + d;
        System.out.println(result);





    }
}
