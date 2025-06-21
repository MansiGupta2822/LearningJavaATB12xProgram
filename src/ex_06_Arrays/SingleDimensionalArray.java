package ex_06_Arrays;

import java.util.Arrays;

public class SingleDimensionalArray {
    public static void main(String[] args) {

        String [] fruits={"Apple", "Banana", "Cherry"};
        int[] temp={25, 28, 22, 30, 26};

        //Print the fruit at the second position in the fruits array (remember array indexing starts from 0).

        System.out.println(fruits[1]);

        //Print the temperature at the last position in the temperatures array without hardcoding the index

         int len=temp.length;
        //System.out.println(len);
        int last=temp.length-1;
        System.out.println(temp[last]);
        System.out.println(temp[temp.length-1]);

        //Change the first fruit in the fruits array to "Grape" and then
        // print the updated array (you can print it using a loop or Arrays.toString()).

        fruits[0]="Grape";
        System.out.println(Arrays.toString(fruits));

    }
}
