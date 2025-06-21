package Test;

public class Question9 {
    public static void main(String[] args) {
//        Create a program using switch statement to display the day of the week.


        int Day=9;
        switch(Day){
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wednesday");break;
            case 4: System.out.println("Thrusday");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");break;
            case 7: System.out.println("Sunday");break;
            default:
                System.out.println("Invalid Day");
                break;

        }

    }
}
