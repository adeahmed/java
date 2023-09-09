package Week3.Interfaces;

public class Motorcycle extends Vehicle{
        private String name = "Motorcycle";
        private String fuel = "Gasoline";
        private String color = "Black";
        private int numberOfSeats = 2;

        public Motorcycle(String color){
            this.color = color;

        }

        public void start() {
            System.out.println("Motorcycle is starting");
        }
        public void stop() {
            System.out.println("Motorcycle is stopping");
        }

        public void getInformation() {
            System.out.println("Name: " + name);
            System.out.println("Fuel: " + fuel);
            System.out.println("Color: " + color);
            System.out.println("Number of seats: " + numberOfSeats);
        }

      
}
