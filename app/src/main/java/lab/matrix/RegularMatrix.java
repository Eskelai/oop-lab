package lab.matrix;

import lab.vector.RegularVector;

import java.util.Random;
import java.util.Vector;

public class RegularMatrix extends MatrixAbstract {
    private Vector<RegularVector> vector; // Vector of vectors
    // First number is num of column
    // Second number is row

    public RegularMatrix(int size) {
        vector = new Vector<>();
        int cols_size = size;
        int rows_size = size;

        for (int row_id = 0; row_id < rows_size; row_id++) {
            RegularVector row = new RegularVector(rows_size);
            vector.add(row);
        }
    }

    public RegularMatrix(int size, boolean random_fill) {
        if (random_fill == false) {
            // FIXME: Raise error
        }
        Random rand = new Random();
        vector = new Vector<>();

        for (int row_id = 0; row_id < size; row_id++) {
            RegularVector row = new RegularVector(0);
            for (int col_id = 0; col_id < size; col_id++) {
                row.write(rand.nextInt(-10, 10));
            }
            vector.add(row);
        }
    }

    @Override
    public int getColsAmount() {
        return vector.size();
    }

    @Override
    public int getRowsAmount() {
        return vector.elementAt(0).getSize();
    }

    @Override
    public int read(int col_id, int row_id) {
        return vector.elementAt(col_id).read(row_id);
    }

    @Override
    public void write(int col_id, int row_id, int value) {
        vector.elementAt(col_id).change(row_id, value);
    }

}
