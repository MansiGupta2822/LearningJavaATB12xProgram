package ex_06_Arrays;

public class Array_ForLoop {
    public static void main(String[] args) {
//        Write a Java program that creates an int array named numbers and initializes it with values from 1 to 10.
//        Use a traditional for loop to iterate through this numbers array.
//        Inside the loop, print only the even numbers.

        int a[]={1,2,3,4,5,6,7,8,9,10};

        for (int i=0; i<a.length; i++)
        {
            if(a[i]%2==0)
            System.out.println(a[i]);
        }
    }
}
