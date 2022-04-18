package lab.matrix;

import lab.vector.RegularVector;

import java.util.Random;
import java.util.Vector;

public class RegularMatrix extends MatrixAbstract {
    Vector<RegularVector> vector; // Vector of vectors

    public RegularMatrix(int size) {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; i < size; i++) {
                // rows.write(rand.nextInt(-10, 10));
            }
        }
    }

    @Override
    public int getColsAmount() {
        return vector.size();
    }

    @Override
    public int getRowsAmount() {
        return 0;
        // return columns.getSize();
    }

    @Override
    public int read() {
        return 0;
    }

    @Override
    public int write() {
        return 0;
    }

}
