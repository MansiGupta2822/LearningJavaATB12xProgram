package ex_04_Java_Basics;

public class String_SplitMethod {
    public static void main(String[] args) {
        //Split a string into an array of substrings based on a delimiter.
        String csvData = "apple,banana,orange,grape";

//Split csvData by the comma (,) delimiter.
        String[] fruit=csvData.split(",");

// Iterate through the resulting array and print each fruit on a new line. (Hint: A for-each loop is very suitable here).

        for(String data:fruit)
        {
            System.out.println(data);
        }
    }
}
