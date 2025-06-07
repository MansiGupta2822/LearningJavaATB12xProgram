package ex_04_Java_Basics;

public class Finding_Substrings_Indexes {
    public static void main(String[] args) {

        //Find the position (index) of a character or substring.
        String sentence = "Java is a powerful language. Java is widely used.";

        //Find the first occurrence of the character 'a' in sentence and print its index.
        System.out.println(sentence.indexOf('a'));

        //Find the first occurrence of the substring "Java" in sentence and print its index.
        System.out.println(sentence.indexOf("Java"));

        //Find the last occurrence of the substring "Java" in sentence and print its index.
        System.out.println(sentence.lastIndexOf("Java"));

        //Find the index of a substring that is not present (e.g., "Python") and observe the result.

        System.out.println(sentence.indexOf("Python"));
    }
}
