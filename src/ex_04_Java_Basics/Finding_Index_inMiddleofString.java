package ex_04_Java_Basics;

public class Finding_Index_inMiddleofString {
    public static void main(String[] args) {
//        Finding the Nth Occurrence
//        Find the index of the second occurrence of a specific character in a string.
        String email = "john.doe@example.com";

//        Find the index of the first occurrence of the character . (dot) in the email string
//        and store it in an int variable.
        int first=email.indexOf('.');

//        Using the result from step 1, find the index of the second occurrence of the character . (dot) in the email string
//        and store it in another int variable.
        int second= email.indexOf('.', first+1);

//        Print both indices clearly labeled (e.g., "First dot at index: X", "Second dot at index: Y").
        System.out.println("First dot at the index:"+ first);
        System.out.println("Second dot at the index:" + second);

    }
}
