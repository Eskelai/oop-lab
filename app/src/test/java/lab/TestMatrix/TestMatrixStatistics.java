package lab.TestMatrix;

import org.junit.jupiter.api.Test;

import lab.matrix.RegMatrix;
import lab.matrix.utils.MatrixStatistics;

public class TestMatrixStatistics {
    RegMatrix getTestMatrix() {
        RegMatrix matrix = new RegMatrix(2);
        /*
         * |0,1|
         * |1,2|
         */
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix.write(i, j, i + j);
            }

        }
        return matrix;
    }

    RegMatrix test_matrix = getTestMatrix();

    @Test
    void getSum() {
        MatrixStatistics Stats = new MatrixStatistics(test_matrix);
        int sum = Stats.getSum();
        assert (sum > 0);
    }

    @Test
    void getMedium() {
        MatrixStatistics Stats = new MatrixStatistics(test_matrix);
        int medium = Stats.getMedium();
        assert (medium > 0);
    }

    @Test
    void getNotNull() {
        MatrixStatistics Stats = new MatrixStatistics(test_matrix);
        int not_null = Stats.getNotNull();
        assert (not_null == 3);
    }

    @Test
    void getMax() {
        MatrixStatistics Stats = new MatrixStatistics(test_matrix);
        int max = Stats.getMax();
        assert (max == 2);
    }

}
