package Week3.Inheritance.Car.task3;
import java.util.ArrayList;
public class ShapeCalculator {
    public static void main(String[] args) {
        System.out.println("Shape Calculator");
        System.out.println("---------------");
        ArrayList<Shape> shapesList = new ArrayList<Shape>();
        shapesList.add(new Circle(5));
        shapesList.add(new Rectangle(5, 10));
        shapesList.add(new Triangle(5, 10));
        for (Shape shape : shapesList) {
            System.out.println("Area of " + shape.getClass().getSimpleName() + " is " + shape.calculateArea());
        }
        


        //
        //Create an array of Shape objects containing instances of Circle, Rectangle, and Triangle.
        //Loop through the array and display the area of each shape.
        
       



       
    }


    
}
