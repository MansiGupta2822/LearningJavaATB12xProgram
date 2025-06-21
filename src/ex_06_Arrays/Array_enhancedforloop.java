package ex_06_Arrays;

public class Array_enhancedforloop {
    public static void main(String[] args) {
//Using the same numbers array from Question A (the one initialized with values from 1 to 10),
// use an enhanced for-each loop to calculate the sum of all elements in the array.
//  After the loop, print the total calculated sum.

        int a[]={1,2,3,4,5,6,7,8,9,10};   //1+2=3 3+4=7 7+5=12 and so on
        int sum=0;

        for(int i:a)
        {
            sum=sum+ i; //1st iteration-sum=0+1 which 1 then 1+2=3 then 3+3=6 and so on...
        }
        System.out.println(sum);
    }
}
