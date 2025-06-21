package ex_06_Arrays;

import java.util.Arrays;

public class Find_Duplicate_InArray {
    public static void main(String[] args) {
        //Write a Java program that finds and prints duplicate elements within an integer array
        int[] number={1, 2, 5, 5, 6, 6, 7, 2, 8,1};
        //System.out.println("All numbers are:" + Arrays.toString(number));

        for (int i=0; i<number.length; i++)
        {
            for (int j=i+1; j<number.length; j++)
            {
                if(number[i]==number[j])
                    System.out.println("duplicate number:" + number[j]);
            }
        }
        System.out.println(Arrays.toString(number));
    }
}
