package lab.matrix;

import java.util.Random;

import lab.vector.SparseVector;
import java.util.Vector;

// FIXME: Complete copy of regular matrix
public class SparseMatrix extends MatrixAbstract {
    private Vector<SparseVector> vector; // Vector of vectors
    // First number is num of column
    // Second number is row

    public SparseMatrix(int size) {
        vector = new Vector<>();

        for (int row_id = 0; row_id < size; row_id++) {
            SparseVector row = new SparseVector(size);
            vector.add(row);
        }
    }

    public SparseMatrix(int size, boolean random_fill) {
        Random rand = new Random();
        vector = new Vector<>();

        for (int row_id = 0; row_id < size; row_id++) {
            SparseVector row = new SparseVector(0);
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
        return vector.get(0).getSize();
    }

    @Override
    public int read(int col_id, int row_id) {
        return vector.get(col_id).read(row_id);
    }

    @Override
    public void write(int col_id, int row_id, int value) {
        vector.get(col_id).change(row_id, value);
    }

}
