package Interview_chatGPT;

public class Q7 {
    public static void main(String[] args) {
        //prime number

//        System.out.println("Prime numbers between 1 to 100");
//
//        for (int i=2; i<=100; i++) {
//            boolean isPrime = true;
//
//            for (int j = 2; j <= Math.sqrt(i); j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//
//            }
//
//            if (isPrime) {
//                System.out.println(i +" " + " is a Prime number");
//            }
//        }


        String a="aabbcdd";


        char[] arr= a.toCharArray();

        for (int i=0; i<=arr.length-1; i++) {
            int count = 0;
            for (int j = 0; j <= arr.length-1; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(arr[i]);
                break;

            }
        }
    }
}
