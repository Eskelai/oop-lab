package lab.matrix;

import lab.vector.SparseVector;

public class SparseMatrix extends MatrixAbstract {
    private SparseVector<SparseVector<Integer>> matrix;

    public SparseMatrix(int side_size) {
        matrix = new SparseVector<SparseVector<Integer>>(side_size);
        // Row based
        for (int i = 0; i < side_size; i++) {
            matrix.write(i, new SparseVector<Integer>(side_size));
        }

    }

    @Override
    public int getColsAmount() {
        return matrix.getSize();
    }

    @Override
    public int getRowsAmount() {
        if (getColsAmount() > 0) {
            return matrix.read(0).getSize();
        }
        return 0;
    }

    @Override
    public int read(int col_id, int row_id) {
        // FIXME: This is horrible hack to allow SparseVector be generic
        if (matrix.read(col_id) == null) {
            return 0;
        }
        if (matrix.read(col_id).read(row_id) == null) {
            return 0;
        }

        return matrix.read(col_id).read(row_id);
    }

    @Override
    public void write(int col_id, int row_id, int value) {
        matrix.read(col_id).write(row_id, value);
    }

}
