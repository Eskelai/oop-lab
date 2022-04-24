package lab.matrix;

import lab.vector.RegularVector;

public class RegularMatrix extends MatrixAbstract {
    private RegularVector<RegularVector<Integer>> matrix;

    public RegularMatrix(int side_size) {
        // 1 vector - rows
        // 2 vector - columns
        matrix = new RegularVector<RegularVector<Integer>>(side_size);
        for (int i = 0; i < side_size; i++) {
            matrix.write(i, new RegularVector<Integer>(side_size));
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
        return matrix.read(col_id).read(row_id);
    }

    @Override
    public void write(int col_id, int row_id, int value) {
        matrix.read(col_id).write(row_id, value);
    }

}
