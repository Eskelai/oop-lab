package lab.matrix;

import lab.vector.IVector;

public abstract class AbstractMatrix implements IMatrix {
    protected IVector[] matrix;

    @Override
    public int getColsAmount() {
        return matrix.length;
    }

    @Override
    public int getRowsAmount() {
        if (getColsAmount() > 0) {
            return matrix[0].getSize();
        }
        return 0;
    }

    @Override
    public int read(int col_id, int row_id) {
        return matrix[col_id].read(row_id);
    }

    @Override
    public void write(int col_id, int row_id, int value) {
        matrix[col_id].write(row_id, value);
    }

}
