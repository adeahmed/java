package Week3.Interfaces.task3;

public class Car extends AbstractVehicle {
    public Car(String fuel) {
        super("Car", fuel, "Red", 4);

    }
    public double calculateFuelEfficiency() {
        return 30.0;
    }
}