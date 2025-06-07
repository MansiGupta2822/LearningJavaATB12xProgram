package Ex_03_Java_Basics;

import org.w3c.dom.ls.LSOutput;

public class Swappingoftwonumbers {
    public static void main(String[] args) {
        //Swapping Two Numbers Without a Third Variable

        int a = 15;
        int b = 25;

        a=a*b; //375
        b=a/b; //15
        a=a/b; //25
        System.out.println(a);
        System.out.println(b);

    }
}
