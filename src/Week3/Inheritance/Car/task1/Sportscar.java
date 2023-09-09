package Week3.Inheritance.Car.task1;
public class Sportscar extends Car {
    public Sportscar(String typeName, float topSpeed, float tank) {
        super(typeName, topSpeed, tank);
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            addSpeed(20); 
            addGas(-10);   

            if (getSpeed() >= getTopSpeed()) {
                setSpeed(getTopSpeed());
            }
        } else {
            setSpeed(0);
        }
    }

    @Override
    public void decelerate(int amount) {
        if (getGasolineLevel() > 0) {
            addSpeed(-amount);  // Adjusted for better deceleration
            if (getSpeed() < 0) {
                setSpeed(0);
            }
        } else {
            setSpeed(0);
        }
    }
}
