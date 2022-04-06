package lab;

import lab.matrix.RegularMatrix;
import lab.vector.RegularVector;

/**
 * Main class
 */
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println("Test");
        RegularVector test = new RegularVector(10);
        test.write("1");
        test.write("123123123");
        System.out.println(test.read(0));
        System.out.println(test.read(1));
        RegularMatrix matrix = new RegularMatrix();
        System.out.println(matrix.vector);
    }
}
