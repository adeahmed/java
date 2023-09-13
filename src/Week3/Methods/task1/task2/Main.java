package Week3.Methods.task1.task2;

import java.io.*;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Double> values = new ArrayList<>();
    private static String path = "C:/Users/adeahmed/JavaOlio23/java/src/Week3/Methods/task1/Data.csv";

    public static void main(String[] args) {
        fibonacci(0, 1);
        System.out.println(values);

        try (Writer writer = new FileWriter(path)) {
            writer.write("Fibonacci sequence:\n");
            for (Double value : values) {
                writer.write(value + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void fibonacci(double valueA, double valueB) {
        if (values.size() >= 100)
            return;
        else if (values.size() == 0)
            values.add(0.0);
        else if (values.size() == 1)
            values.add(1.0);
        double sum = valueA + valueB;
        values.add(sum);
        fibonacci(valueB, sum);
    }
}
