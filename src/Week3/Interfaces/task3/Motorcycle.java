package Week3.Interfaces.task3;

public class Motorcycle extends AbstractVehicle{
   
        public Motorcycle(String color) {
            super("Motorcycle", "Gasoline", color, 2);
}
        public double calculateFuelEfficiency() {
            return 20.0;
        }
}