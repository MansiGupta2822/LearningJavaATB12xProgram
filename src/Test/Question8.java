package Test;

public class Question8 {
    public static void main(String[] args) {
//        Write a program to check if a given year is a leap year.

        int year=2000;

        if (year%4==0 && (year%100!=0 || year%400==0))
        {
            System.out.println(year + " "+ "Year is a Leap Year");
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }
}
