package Test;

public class Question3 {
    public static void main(String[] args) {
        //Write a program that demonstrates comparison and logical operators.

        int a=10;
        int b=5;

        System.out.println("Is A equals to B?:" + (a==b));
        System.out.println("Is A Greator than B?:" + (a>b));
        System.out.println("Is A Less Than B?:" + (a<b));
        System.out.println("Is A Not equals to B?:" + !(a>b));
        System.out.println("Is this AND condition true?:" + ((a>b)&&(a>0)));
        System.out.println("Is thias OR condition true?:" + ((a<b)||(a>0)));

    }
}
