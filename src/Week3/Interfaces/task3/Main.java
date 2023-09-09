package Week3.Interfaces.task3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Blue");
        Motorcycle motorcycle = new Motorcycle("Green");
        Buss bus = new Buss("Yellow");
        ElectricCar electricCar = new ElectricCar("White");
       
        car.start();
        car.stop();
        car.getInformation();
        System.out.println("Fuel Efficiency (Car): " + car.calculateFuelEfficiency() + " MPG");

        motorcycle.start();
        motorcycle.stop();
        motorcycle.getInformation();
        System.out.println("Fuel Efficiency (Motorcycle): " + motorcycle.calculateFuelEfficiency() + " MPG");

        bus.start();
        bus.stop();
        bus.getInformation();
        System.out.println("Fuel Efficiency (Bus): " + bus.calculateFuelEfficiency() + " MPG");

        electricCar.start();
        electricCar.stop();
        electricCar.getInformation();
        electricCar.charge(); // 
    }
       
}
