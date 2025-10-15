package Interview_chatGPT;

public class Q1 {
    public static void main(String[] args) {
        //1.	Reverse a string without using built-in functions.

        String s="Automation";
        String rev="";
        for (int i=s.length()-1; i>=0; i--)
        {
            rev = rev+s.charAt(i);

        }
        System.out.println();
    }
}
