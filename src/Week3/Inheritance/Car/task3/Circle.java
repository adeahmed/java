package Week3.Inheritance.Car.task3;

public class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double calculateArea(){
        return Math.PI * Math.pow(this.radius, 2);
   
    }
    
}
