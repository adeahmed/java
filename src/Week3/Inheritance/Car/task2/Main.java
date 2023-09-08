package Week3.Inheritance.Car.task2;

public class Main {
    public static void main(String[] args) {
        Buss buss = new Buss("Buss");

        buss.passengerEnter(10);
        System.out.println(buss.getNumberOfPassengers());
        buss.passengerExit(10);
        System.out.println(buss.getNumberOfPassengers());

    }
}
