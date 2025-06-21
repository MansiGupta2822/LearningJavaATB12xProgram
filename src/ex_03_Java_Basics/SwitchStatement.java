package ex_03_Java_Basics;

public class SwitchStatement {
    public static void main(String[] args) {
        //Simulate a simple menu selection for a day of the week.

        int dayofweek=7;

        switch (dayofweek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid day");
                break;
        }
//   Write a Java program that determines the type of browser.
//    Declare a String variable browserType and assign it a value like "chrome", "firefox", "edge", or "safari".
//   Use a switch statement to print a message based on browserType:
//	"Launching Chrome browser..." for "chrome"
//	"Launching Firefox browser..." for "firefox"
//	"Launching Edge browser..." for "edge"
//	"Launching Safari browser..." for "safari"
//	For any other value, print "Unsupported browser!".
//                    o	Make sure your switch handles different casing (e.g., "Chrome" should work).
//•	Automation Relevance: if-else is used for conditional execution (e.g., "if element is present, click it; else, log an error"). switch is excellent for handling different test environments or browser types.

                  String browserType ="Edge";
                  switch (browserType.toLowerCase()){
                      case "chrome": System.out.println("Launching browser for chrome"); break;
                      case "firefox": System.out.println("Launching browser for firefox"); break;
                      case "edge": System.out.println("Launching browser for edge"); break;
                      case "safari": System.out.println("Launching browser for safari"); break;
                      default: System.out.println("invalid browser"); break;
                  }


    }
}
