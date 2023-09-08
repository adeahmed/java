package Week3.Inheritance.Car.task3;

public class Triangle extends Shape{
    private double base, height;
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public double calculateArea(){
        return this.base * this.height / 2;
    }
    
}
