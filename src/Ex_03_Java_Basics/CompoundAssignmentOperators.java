package Ex_03_Java_Basics;

public class CompoundAssignmentOperators {
    public static void main(String[] args) {

        //Write a program to simulate updating a score.

        int score=100;

        score += 50;
        System.out.println(score); //100+50=150

        score -=20;
        System.out.println(score); //150-20=130

        score *=2;
        System.out.println(score);//130*2=260

        score /=5;
        System.out.println(score);//260/5=52

        score %=3;
        System.out.println(score);//52%3=1
    }
}
