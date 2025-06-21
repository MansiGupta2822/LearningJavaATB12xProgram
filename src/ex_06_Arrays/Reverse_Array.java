package ex_06_Arrays;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
//        Write a Java program to reverse the elements of an array.
        int[] originalArray={10,20,30,40,50,60};

        //This is the correct approach to reverse the array because it will reverse the array in the memory permanently.
       System.out.print("Original Aray:"+ Arrays.toString(originalArray));
       int left=0;
       int right=originalArray.length-1;
       int temp;
        while(left<right) //0<5
        {
            temp=originalArray[left];
            originalArray[left]=originalArray[right];
            originalArray[right]=temp;
            left++;
            right--;
        }
        System.out.println("Reversed Array:"+ Arrays.toString(originalArray));

        //we can reverse using for loop as well but this will only reads the elements from the array starting from the last index
        // and prints them but did not change the position in memory means if we print that array outside the loop then its position
        // still same i.e 10,20,30,40,50,60

        for (int i=originalArray.length-1; i>=0;  i--) //5>=0
        {
            System.out.print(originalArray[i]+" ");
        }
        System.out.println(Arrays.toString(originalArray));

        //reversing String values

        String[] name={"Mansi", "mona", "deepa","swasti"};

        int a=0;
        int b=name.length-1;

        while(a<b)
        {
            String temp1=name[b];
            name[b]=name[a];
            name[a]=temp1;

            a++;
            b--;
        }
        System.out.println("reversed array:"+ Arrays.toString(name));
    }
}
