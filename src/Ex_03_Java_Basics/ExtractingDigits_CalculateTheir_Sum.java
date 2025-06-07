package Ex_03_Java_Basics;

public class ExtractingDigits_CalculateTheir_Sum {
    public static void main(String[] args) {
        // Given a positive two-digit integer, extract its individual digits and calculate the sum of these digits.

        int a=73;

        int firstnum= 73/10;
        System.out.println(firstnum);

        int secondnum= 73%10;
        System.out.println(secondnum);

        int sum=firstnum+secondnum;
        System.out.println(sum);

        //Extract three-digit number and caculate the sum of them?

        int b=456;

        int num1=b/100;
        System.out.println(num1);

        int num2=b%100;
        System.out.println(num2);

        int num3=num2/10;
        System.out.println(num3);

        int num4= num2%10;
        System.out.println(num4);

        int sum1=num1+num3+num4;
        System.out.println(sum1);

        //Given a total number of seconds, convert it into equivalent hours, minutes, and remaining seconds.

        int totalSeconds = 7385;

        int minutes= 7385/60;
        System.out.println(minutes);

        int hour=minutes/60;
        System.out.println("Hours would be:" + hour);
        System.out.println(hour + "Hours");

        int remainingmin=minutes%60;
        System.out.println("remainingmin would be:" + remainingmin);

        int remainingsec=totalSeconds%60;
        System.out.println("remainingsec would be:" + remainingsec);












    }
}
