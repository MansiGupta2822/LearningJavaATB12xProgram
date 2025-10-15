package Test;

public class Question13 {

    private Question13(){

    }
    public static void main(String[] args) {
        //Write a program to print multiplication tables using nested loops.

        for(int i=1; i<=5; i++)
        {
            System.out.println("Table of:"+ i);
            for(int j=1; j<=10; j++)
            {
                System.out.println(i+"*"+j+"="+i*j);
            }
        }
    }
}
