package ex_03_Java_Basics;

public class Increment_DecrementOperator {
    public static void main(String[] args) {
         int x=5;
         int y=x++;
        System.out.println(x);
        System.out.println(y);

        int x1=5;
        int y1=++x1;
        System.out.println(x1);
        System.out.println(y1);

        int a=10;
        int b=20;
        int result = a++ + ++b-a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(result);

        //Decrement Operator

        int count=20;
        int value=5;
        int product= --count * value--;

        System.out.println(count);
        System.out.println(value);
        System.out.println(product);
    }
}
