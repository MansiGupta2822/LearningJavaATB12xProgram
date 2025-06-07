package ex_04_Java_Basics;

public class Extracting_Modifying_SubString {
    public static void main(String[] args) {
//       Extract parts of a string or replace parts.
     String data = "product_id:12345_name:Laptop_price:999";
        System.out.println(data.indexOf("Laptop"));

//Extract the "Laptop" part (from index 21 to 27 as a hint, but ideally find it programmatically if possible)and print it.
        String s=data.substring(22,28);
        System.out.println(s);

        //OR this one is prefered in real world scenarios
//finding Laptop
        int nameStartIndex = data.indexOf("name:") + "name:".length(); // Finds "name:" then moves past it
        int nameEndIndex = data.indexOf("_price", nameStartIndex); // Finds "_price" starting from after "name:"
        String laptopPart = data.substring(nameStartIndex, nameEndIndex);
        System.out.println(laptopPart); // Output: Laptop
//finding Id
        int a=data.indexOf("product_")+"product_".length();
        int b=data.indexOf(':',a);
        String c=data.substring(a,b);
        System.out.println(c);


//Replace all occurrences of "_" (underscore) with "-" (hyphen) in the data string and print the new string.

        String rep= data.replace('_','-');
        System.out.println(rep);

    }
}
