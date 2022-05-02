package lab.matrix.utils;

import java.util.Random;

import lab.matrix.IMatrix;

public class MatrixScrambled implements IMatrix {
    private IMatrix matrix;
    private IMatrix saved_matrix;

    public MatrixScrambled(IMatrix matrix) {
        this.matrix = matrix;
    }

    public void moveNumbers() {
        int cols = matrix.getColsAmount();
        int rows = matrix.getRowsAmount();
        Random rnd = new Random();

        if (cols * rows < 2) {
            throw new RuntimeException("Not enough numbers to move");
        }

        // saved_matrix = matrix; // FIXME: This is a reference
        // Keep list of changes?

        int first_col = rnd.nextInt(cols);
        int first_row = rnd.nextInt(rows);
        int first_number = matrix.read(first_col, first_row);

        int second_col = rnd.nextInt(cols);
        int second_row = rnd.nextInt(rows);
        int second_number = matrix.read(second_col, second_row);

        matrix.write(first_col, first_row, second_number);
        matrix.write(second_col, second_row, first_number);
    }

    public void resetMatrix() {
        matrix = saved_matrix;
    }

    @Override
    public int read(int col_id, int row_id) {
        return matrix.read(col_id, row_id);
    }

    @Override
    public void write(int col_id, int row_id, int value) {
        matrix.write(col_id, row_id, value);
    }

    @Override
    public int getColsAmount() {
        return matrix.getColsAmount();
    }

    @Override
    public int getRowsAmount() {
        return matrix.getColsAmount();
    }

}
