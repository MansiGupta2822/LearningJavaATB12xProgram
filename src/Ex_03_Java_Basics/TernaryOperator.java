package Ex_03_Java_Basics;

public class TernaryOperator {
    public static void main(String[] args) {
        //Determine the larger of two numbers using the ternary operator.

        int num1=50;
        int num2=30;

        String Result= num1>num2 ? "num1 is greator" : "num2 is greator";
        System.out.println(Result);

        //OR

        int maxnumber= (num1>num2)?num1:num2;
        System.out.println("maximum number is:" +maxnumber);
    }
}
