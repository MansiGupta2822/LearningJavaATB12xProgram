package Interview_chatGPT;

public class Q4 {
    public static void main(String[] args) {
       // Reverse letters only – Two pointers swap letters, ignore digits/specials

        char[] arr = "c23ofor@2ge".toCharArray();
        System.out.println(arr);

        int i=0, j=arr.length-1;
        while(i<j)
        {
            if(!Character.isLetter(arr[i]))
            {
              i++;
            }else if (!Character.isLetter(arr[j]))
            {
                j--;
            }
            else
            {
                char temp= arr[i];
                arr[i]=arr[j];
                arr[j]= temp;
                i++;
                j--;

            }
        } System.out.println(new String(arr));
    }
}
