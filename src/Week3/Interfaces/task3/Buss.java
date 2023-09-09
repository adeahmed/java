
package Week3.Interfaces.task3;

public class Buss extends AbstractVehicle {
   public Buss(String color) {
       super("Buss", color, "Yellow", 50);
   }

   public double calculateFuelEfficiency() {
       return 10.0;
   }
   
    
}
