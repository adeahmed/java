package Week3.Inheritance.Car.task3;

public class Rectangle extends Shape{
    private double width, height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double calculateArea(){
        return this.width * this.height;
    }
    
}
