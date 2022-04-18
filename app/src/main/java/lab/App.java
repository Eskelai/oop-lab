package lab;

import lab.matrix.RegularMatrix;
import lab.vector.RegularVector;
import lab.vector.SparseVector;

/**
 * Main class
 */
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Test");
        int[] members = new int[] { 1, 2, 0, 0, 0 };
        SparseVector Sparse = new SparseVector(members);
        System.out.println(Sparse.getSize());
        System.out.println("Test");
    }
}
