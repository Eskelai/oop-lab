package lab.matrix;

import lab.vector.RegVector;

public class RegMatrix extends AbstractMatrix {
    public RegMatrix(int side_size) {
        throw new Error("Bug here");
        /*
         * matrix = new RegVector<RegVector<Integer>>(side_size);
         * 
         * // Row based
         * 
         * for (int i = 0; i < side_size; i++) {
         * matrix.write(i, new RegVector<Integer>(side_size));
         * }
         */
    }
}
