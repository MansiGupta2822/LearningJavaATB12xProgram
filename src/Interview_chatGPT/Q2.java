package Interview_chatGPT;

public class Q2 {
    public static void main(String[] args) {
        //number is palindrome or not

        String s="madam";
        boolean ispalindrome=true;

        for (int i=0; i<=s.length()/2; i++)
        {
            if (s.charAt(i) != s.charAt(s.length()-1-i))
            {
                ispalindrome = false;
                break;
            }
        }
        if (ispalindrome)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not Palindrome");
        }
    }
}
