package Interview_chatGPT;

public class Q5 {
    public static void main(String[] args) {
        //Reverse string – Simple for loop or StringBuilder.
//        StringBuilder s= new StringBuilder("Mansi");
//        s.reverse();
//        System.out.println(s);

        String s="Manhjhi";
        String rev="";
         for(int i=s.length()-1; i>=0; i--)
         {
             rev += s.charAt(i);
         }
        System.out.println(rev);
    }
}
