package ex_04_Java_Basics;

public class String_CaseConversion_Whitespace {
    public static void main(String[] args) {
//        Change string casing and remove leading/trailing whitespace.

        String mixedCase = "HeLlO WoRlD";
        String whitespace = " Trim me! ";

//        Convert mixedCase to all uppercase and print it.
        System.out.println(mixedCase.toUpperCase());

//        Convert mixedCase to all lowercase and print it.
        System.out.println(mixedCase.toLowerCase());

//        Remove leading and trailing whitespace from whitespace and print the result.
        System.out.println(whitespace.trim());

    }
}
