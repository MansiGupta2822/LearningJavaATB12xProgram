package ex_02_Java_Basics;

public class Task2 {

    //Ternary Operator-- Number even and odd

    public static void main(String[] args) {
        int a=13;
        String Num= a%2==0 ? "Number is Even" : "Number is odd" ;
        System.out.println(Num);

        // maximym of three numbers using nested ternary operator

        int n1=70;
        int n2=30;
        int n3=65;
        String result= (n1> n2) ? (n1>n3 ? "n1 is maximum" : "n3 is maximum") : (n2>n3 ? "n2 is greator":"n3 is greator") ;
        System.out.println(result);

        //  Find age using nested ternary operator

        int age=67;
        String Res= (age>18) ? (age>=18 && age<=65 ? "Adult" : "Senior") : "Minor";
        System.out.println(Res);


    }


}
