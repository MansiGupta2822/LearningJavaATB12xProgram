package ex_01_Java_Basics;

public class Decrement_operator {
    public static void main(String[] args) {
        int i = 1, j = 2, k = 3;

        int m = i-- - j-- - k--; //1-2-3 =-4

        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);
    }
}
