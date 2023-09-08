package Week3.Inheritance.Car;


public class Main {
    public static void main(String[] args) {
        Sportscar mySportsCar = new Sportscar("G Wagon", 300, 80);
        mySportsCar.fillTank();

        for (int i = 0; i < 6; i++) {
            mySportsCar.accelerate();
            System.out.println(mySportsCar.getTypeName() + ": speed is " + mySportsCar.getSpeed() + " km/h");
        }
        while (mySportsCar.getSpeed() > 0) {
            mySportsCar.decelerate(10);
            System.out.println(mySportsCar.getTypeName() + ": speed is " + mySportsCar.getSpeed() + " km/h");
        }
    }
}
