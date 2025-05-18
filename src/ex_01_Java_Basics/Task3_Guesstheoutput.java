package ex_01_Java_Basics;

public class Task3_Guesstheoutput {
    public static void main(String[] args) {
        int a = 11, b = 22, c;

        c = a + b + a++ + b++ + ++a + ++b; // 11+22+11+22+13+24

       System.out.println("a=" + a); //13

        System.out.println("b=" + b); //24

        System.out.println("c=" + c); //103
    }
}
