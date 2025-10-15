package Interview_chatGPT;

import java.sql.SQLOutput;

public class Q6 {
    public static void main(String[] args) {
        //Palindrome – Compare left & right ignoring special chars.

        String s1="112211";
        boolean isPalindrome=true;

        for (int i=0; i<=s1.length()/2; i++)
        {
            if (s1.charAt(i) != s1.charAt(s1.length()-1-i))
            {
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
