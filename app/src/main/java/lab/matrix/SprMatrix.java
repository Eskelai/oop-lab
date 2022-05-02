package lab.matrix;

import lab.vector.SprVector;

public class SprMatrix extends AbstractMatrix {
    private SprVector<SprVector<Integer>> matrix;

    public SprMatrix(int side_size) {
        matrix = new SprVector<SprVector<Integer>>(side_size);
        // Row based
        for (int i = 0; i < side_size; i++) {
            matrix.write(i, new SprVector<Integer>(side_size));
        }

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
}
