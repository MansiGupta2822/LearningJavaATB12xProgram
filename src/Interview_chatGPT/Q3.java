package Interview_chatGPT;

public class Q3 {
    public static void main(String[] args) {
        //Find the second largest number in an array.

        int a[] = {10,20,1,29,30,9};
        int first= Integer.MIN_VALUE;
        int second= Integer.MIN_VALUE;

        for(int i:a)
        {
            if(i>first)
            {
              second=first;
              first=i;

            }
            else if(i>second && i!=first)
            {
                second=i;
            }
        }
        System.out.println("second largerst number is" + second);
    }
}
