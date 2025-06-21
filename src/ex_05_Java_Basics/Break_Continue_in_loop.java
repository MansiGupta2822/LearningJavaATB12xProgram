package ex_05_Java_Basics;

public class Break_Continue_in_loop {
    public static void main(String[] args) {
        //Demonstrate the use of break to exit a loop early and continue to skip the current iteration.

        for(int i=1;i<=10;i++)
        {
            if (i==5)
            {
                break;
            }
            System.out.println(i);
        }

        for(int i=1;i<=10;i++)
        {
            if (i==5)
            {
                continue;
            }
            System.out.println(i);
        }

    }
}
