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
       // for (Shape shape : shapesList) {
           // System.out.println("Area of " + shape.getClass().getSimpleName() + " is " + shape.calculateArea());
       // }
// taks 4 on tässä
        Shape shape1 = shapesList.get(1);
        Shape shape2 = shapesList.get(1);


        if (areShapesCompatible(shape1, shape2)) {
            System.out.println("The shapes are compatible for the operation.");
        } else {
            System.out.println("The shapes are not compatible for the operation.");
        }
    }

    public static boolean areShapesCompatible(Shape shape1, Shape shape2) {
        return shape1.getClass() == shape2.getClass();

        
    }
    }
