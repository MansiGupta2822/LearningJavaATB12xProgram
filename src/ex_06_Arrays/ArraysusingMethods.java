package ex_06_Arrays;

public class ArraysusingMethods {
    // Define a public static boolean containsElement(String[] array, String elementToFind) method.
    public static boolean containsElement(String[] array, String elementToFind)
    {
       for (String containel:array) {
           if (containel.equals(elementToFind)) {
               return true;}}
       return false;
    }

    String Person(String Name){
        System.out.println("Name is good");
        return Name;
    }

    public static void main(String[] args) {

        String[] colors={"Red", "Green", "Blue", "Yellow"};
        boolean Element=containsElement(colors, "Green");
        System.out.println(Element);
        boolean element=containsElement(colors, "Purple");
        System.out.println(element);

        ArraysusingMethods a=new ArraysusingMethods();
        String N=a.Person("Mansi");
        System.out.println(N);





    }
}
