package Week3.Interfaces.task3;

public abstract class AbstractVehicle implements Vehicle {
    private String name;
    private String fuel;
    private String color;
    private int numberOfSeats;

    public AbstractVehicle(String name, String fuel, String color, int numberOfSeats) {
        this.name = name;
        this.fuel = fuel;
        this.color = color;
        this.numberOfSeats = numberOfSeats;
    }

    public void start() {
        System.out.println(name + " is starting");
    }

    public void stop() {
        System.out.println(name + " is stopping");
    }

    public void getInformation() {
        System.out.println("Name: " + name);
        System.out.println("Fuel: " + fuel);
        System.out.println("Color: " + color);
        System.out.println("Number of seats: " + numberOfSeats);
    }
}
