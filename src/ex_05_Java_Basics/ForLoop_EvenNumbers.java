package ex_05_Java_Basics;

public class ForLoop_EvenNumbers {
    public static void main(String[] args) {
        //Print all even numbers from 2 to 10 (inclusive).

        for(int i=2; i<=10; i++)
        {
            if(i%2==0)
                System.out.println(i);
        }
        //OR

        for(int i=2; i<=10; i+=2)
        {
            System.out.println(i);
        }
    }
}
