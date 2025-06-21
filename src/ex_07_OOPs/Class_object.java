package ex_07_OOPs;

//Design a Java class to represent a Car, and then create and interact with Car objects.
 class Car{
    String make;
    String model;
    int year;
    int speed=0;

    void startEngine()
    {
        System.out.println(make + " " + model + " " + "Engine Started");
    }
    void stopEngine()
    {
        System.out.println(make + " " + model + " " + "Engine Stopped");
    }
    void accelarate(int increment)
    {
        this.speed += increment;
        System.out.println("Accelerating by"+ " " + increment + "mph." + " " + "Current speed:" +" " + this.speed + "mph.");
    }

    void brake (int decrement)
    {
        this.speed -= decrement;
        if(this.speed <= 0)
        {
            this.speed=0;
        }
        System.out.println("Braking by"+ " " + decrement + "mph." + " " + "Current speed:" + " " + this.speed + " mph.");

    }
    void displaycardetails()
    {
        System.out.println("The car make is:" + this.make );
        System.out.println("The car model is:" + this.model );
        System.out.println("The car model year is:" + this.year );
        System.out.println("current car speed is:" + this.speed );
    }

         public static void main(String[] args) {

        Car c1=new Car();
        c1.make="Honda";
        c1.model="Civic";
        c1.year= 2023;
        c1.displaycardetails();
        c1.startEngine();
        c1.accelarate(20);
        c1.accelarate(30);
        c1.brake(51);
        c1.displaycardetails();
        c1.stopEngine();

        Car c2=new Car();
             c2.make="Tesla";
             c2.model="Model 3";
             c2.year= 2024;
             c2.displaycardetails();
             c2.startEngine();
             c2.accelarate(50);
             c2.stopEngine();

    }
}

public class Class_object {

}
