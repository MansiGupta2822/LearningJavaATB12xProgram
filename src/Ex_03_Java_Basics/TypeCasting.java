package Ex_03_Java_Basics;

public class TypeCasting {
    public static void main(String[] args) {

       // Type casting (Widening)

        int numint=100;
        double numdouble=numint;

        //double numdouble=(double) numint;
        System.out.println("numint:"+ numint);
        System.out.println("numdouble:" + numdouble);

        //Type casting (narrowing)

        //use explicit casting to assign pi to roundedPi. Print roundedPi.

        double pi=3.14159;
        int roundedpi= (int) pi;
        System.out.println(roundedpi);

        //Declare a long variable bigNumber and assign it 2000000000L (2 billion).
        // Cast this long to an int and store it in smallNumber.
        // Print smallNumber. What do you observe? Why? (Hint: Think about int's max value).

        long bignumber=2000000000L;
        int smallnumber= (int) bignumber;
        System.out.println(smallnumber);

        //Write a Java program to convert: implicit(Widening)
        //int to long
        //float to double
        //char to int (What is the ASCII value of a character?)

        int a=10;
        long b=a;
        System.out.println(b);

        float c=10.5F;
        double d=c;
        System.out.println(d);

        char e='A';
        int f=e;
        System.out.println(e);

        //Create a method that takes an int and prints it as a double.

        int g=20;
        double h=g;
        System.out.println(h);

        //Write a program to add an int and a float and print the result as a double.

        int i=15;
        float k=20.89f;
        double l= i+k;
        System.out.println(l);

        // Convert: Explicit (Narrowing)
        //double to int
        //float to int
        //long to byte

        double m=10.89;
        int n = (int) m;
        System.out.println(n);

        float o=19.56F;
        int p= (int) o;
        System.out.println(p);

        long q=4467578689689L;
        byte r=(byte) q;
        System.out.println(r);


        //Write a program that casts a double with a decimal (e.g. 89.45) to an int and prints the result.

        double dou=89.75;
        int in= (int) dou;
        System.out.println(in);

        //Take a char input and convert it to its ASCII int value and back to a character.

        char ch='G';
        int as=(int) ch;
        System.out.println(as);

        char chi=(char)as;
        System.out.println(chi);

        //Try casting a large int value to a byte. What happens?

        int la=130;
        byte by=(byte)la;
        System.out.println(by);

    }
}
