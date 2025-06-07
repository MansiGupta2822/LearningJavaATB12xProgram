package ex_04_Java_Basics;

public class StringComparison_CheckingContent {
    public static void main(String[] args) {

        //Compare strings and check if they contain specific sequences.

        String str1 = "Selenium";
        String str2 = "selenium";
        String str3 = "World";

        //Check if str1 is equal to str2 (case-sensitive).
        // Print "str1 equals str2 (case-sensitive)" or "str1 does NOT equal str2 (case-sensitive)".

        if(str1.equals(str2)){
            System.out.println("str1 equals str2 (case-sensitive)");
        } else{
            System.out.println("str1 does NOT equal str2 (case-sensitive)");
        }

        //Check if str1 is equal to str2 (case-insensitive).
        //Print "str1 equals str2 (case-insensitive)" or "str1 does NOT equal str2 (case-insensitive)".

        if(str1.equalsIgnoreCase(str2)){
            System.out.println("str1 equals str2 (case-insensitive)");
        } else{
            System.out.println("str1 does NOT equal str2 (case-insensitive)");
        }

        //Check if str1 contains the substring "len". Print "str1 contains 'len'" or "str1 does NOT contain 'len'".

        if(str1.contains("len"))
        {
            System.out.println("str1 contains 'len'");
        } else{
            System.out.println("str1 does NOT contain 'len'");
        }

        //Check if str1 starts with "Sel". Print "str1 starts with 'Sel'" or "str1 does NOT start with 'Sel'".

        if(str1.startsWith("Sel")){
            System.out.println("str1 starts with 'Sel'");
        } else{
            System.out.println("str1 does NOT start with 'Sel'");
        }





    }
}
