package ex_05_Java_Basics;

public class for_each_loopusingArray {
    public static void main(String[] args) {
        //Iterate over an array of names and print each name.

        String[] names = {"Alice", "Bob", "Charlie", "David"};

        for (String i:names)
        {
            System.out.println("Hello"+" " +i);
        }
    }
}
