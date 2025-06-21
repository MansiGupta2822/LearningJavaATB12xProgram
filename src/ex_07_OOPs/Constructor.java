package ex_07_OOPs;

public class Constructor {
    String make;
    String model;
    int year;
    int speed=0;
Constructor()
{
    System.out.println("A new Car object has been created using the default constructor.");
}

Constructor (String make, String Model, int year)
{
    this.make=make;
    this.model=Model;
    this.year=year;
    System.out.println("A new" + " " + make + " " + Model + " " + year + " " + "Car object has been created using the parameterized constructor.");
}
    void displaycardetails() {
        System.out.println("The car make is:" + this.make);
        System.out.println("The car model is:" + this.model);
        System.out.println("The car model year is:" + this.year);
    }
    public static void main(String[] args) {
        Constructor C=new Constructor("Honda", "Civic", 2023);
        Constructor cn=new Constructor();
        cn.make="Tesla";
        cn.model="Model 1";
        cn.year=2024;
        cn.displaycardetails();
    }
}
