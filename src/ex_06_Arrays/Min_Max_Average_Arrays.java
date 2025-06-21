package ex_06_Arrays;

public class Min_Max_Average_Arrays {
    public static void main(String[] args) {
//Write a Java program that declares a double array named grades and initializes it with at least five decimal values
// (e.g., [85.5, 92.0, 78.3, 89.7, 95.1]).

        double grades[]={85.5, 92.0, 99.89, 89.7, 7.0};

        // Calculate and print the average grade.
        double sum=0.0;
        for (double i:grades)
        {
            sum=sum+i;

        }//System.out.println(sum);
        int len=grades.length;
        //System.out.println(len);
        double Avg=sum/len;
        System.out.println("Average Grade is"+ " " +Avg);

        // Find and print the maximum grade in the array.
        double Max=grades[0];
        for (double j:grades)
        {
           if(j>Max)
               Max=j;

        }
        System.out.println(Max);

        // Find and print the minimum grade in the array.

        double Min=grades[0];
        for(double i:grades)
        {
            if(i<Min)
                Min=i;

        }
        System.out.println(Min);

    }
}
