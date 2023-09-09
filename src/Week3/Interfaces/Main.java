package Week3.Interfaces;
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Blue");
        Motorcycle motorcycle = new Motorcycle("Green");
        Buss buss = new Buss();

        car.start();
        car.stop();
        car.getInformation();

        motorcycle.start();
        motorcycle.stop();
        motorcycle.getInformation();

        buss.start();
        buss.stop();
        buss.getInformation();
    }
}
