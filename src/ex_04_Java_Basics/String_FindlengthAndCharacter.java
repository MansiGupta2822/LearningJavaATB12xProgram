package ex_04_Java_Basics;

public class String_FindlengthAndCharacter {
    public static void main(String[] args) {

        //Get the length of a string and access individual characters

        String text = "Automation";
        int length = text.length();
        System.out.println(length);

        //Print the character at index 3 of the text string.

        char ind = text.charAt(3);
        System.out.println(ind);

        //Print the last character of the text string (without knowing its length beforehand).

        char last = text.charAt(text.length()-1);
        System.out.println(last);

    }
}

