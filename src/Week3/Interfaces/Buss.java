package Week3.Interfaces;

public class Buss extends Vehicle {
    private String name = "Buss,"; 
    private String fuel = "Diesel";
    private String color = "Yellow";
    private int numberOfSeats = 20;

    public void start() {
        System.out.println("Buss is starting");
    }
    public void stop() {
        System.out.println("Buss is stopping");
    }
    public void getInformation() {
        System.out.println("Name: " + name);
        System.out.println("Fuel: " + fuel);
        System.out.println("Color: " + color);
        System.out.println("Number of seats: " + numberOfSeats);
    }
    
}
