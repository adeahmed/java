package Week3.Inheritance.Car.task2;

public class Buss extends Car {
    private int numberOfPassengers = 0;

    public Buss(String typeName) {
        super(typeName); 
        
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void passengerEnter(int numberOfPassengers) {
        this.numberOfPassengers += numberOfPassengers;
    }

    public void passengerExit(int numberOfPassengers) {
        this.numberOfPassengers -= numberOfPassengers;
    }
}