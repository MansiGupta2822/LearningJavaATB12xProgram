package ex_02_Java_Basics;

public class Task3 {
    public static void main(String[] args) {
        int i = 11;
        i = i++ + ++i;

        System.out.println(i);

        //ERT (Expression and Result table)
        // 5|11|NA
        // 6 | 11 + 13
        //7|24
    }

}
