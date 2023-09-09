package Week3.Interfaces;

public class Car extends Vehicle {
    private String name = "Car";
    private String fuel = "Gasoline";
    private String color = "Red";
    private int numberOfSeats = 5;

    public Car(String color){
        this.color = color;

    }

    public void start() {
        System.out.println("Car is starting");
    }
    public void stop() {
        System.out.println("Car is stopping");
    }
    public void getInformation() {
        System.out.println("Name: " + name);
        System.out.println("Fuel: " + fuel);
        System.out.println("Color: " + color);
        System.out.println("Number of seats: " + numberOfSeats);
    }


  
    
}
