package Week3.Interfaces.task3;
public class ElectricCar extends AbstractVehicle implements ElectricVehicle {
    public ElectricCar(String color) {
        super("Electric Car", "Electricity", color, 5);
    }

    @Override
    public void charge() {
        System.out.println("Charging the electric car");
    }

    public double calculateFuelEfficiency() {
        return 100.0;
    }
}


