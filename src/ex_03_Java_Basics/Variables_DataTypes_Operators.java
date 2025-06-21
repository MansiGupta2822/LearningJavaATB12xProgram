package ex_03_Java_Basics;

public class Variables_DataTypes_Operators {
    public static void main(String[] args) {
        int age=32;
        String FirstName="Mansi";
        boolean student = true;
        double price= 29.99;

        //Add 5 to age and store it in a new int variable futureAge.

        int futureage= age+5;
        System.out.println(futureage);

        //Check if age is greater than or equal to 18. Store the result in a boolean variable canVote.

        boolean canvote= (age>=18);
        System.out.println(canvote);

        //Check if Student is true AND age is less than 25. Store the result in a boolean variable youngStudent.

        boolean youngstudent= (student && age<25);
        System.out.println(youngstudent);

        //Print the values of all declared variables and the results of the operations to the console.

        System.out.println(age);
        System.out.println(FirstName);
        System.out.println(student);
        System.out.println(price);


    }
}
