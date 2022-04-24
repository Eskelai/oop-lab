package lab.matrix;

import java.util.Random;

public class MatrixInitiator {

    // Matrix 3x3
    // FIXME: This won't work
    public static void fill_matrix(MatrixInterface matrix, int not_null_values, int max_value) {
        Random rnd = new Random();
        int matrix_size = 3 * 3;
        int null_values = matrix_size - not_null_values;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (null_values == 0) {
                    matrix.write(i, j, rnd.nextInt(max_value) + 1);
                } else {
                    matrix.write(i, j, 0);
                    null_values -= 1;
                }
            }
        }
    }
}
