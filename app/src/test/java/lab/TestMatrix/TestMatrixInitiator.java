package lab.TestMatrix;

import org.junit.jupiter.api.Test;

import lab.matrix.RegMatrix;
import lab.matrix.utils.MatrixInitiator;

public class TestMatrixInitiator {

    @Test
    void InitializeMatrix() {
        RegMatrix matrix = new RegMatrix(3);
        MatrixInitiator.fill_matrix(matrix, 9, 15);
        assert matrix.read(0, 1) != 0;
        assert matrix.read(2, 2) != 0;
    }

    @Test
    void InitializeEmptyMatrix() {
        RegMatrix matrix = new RegMatrix(3);
        MatrixInitiator.fill_matrix(matrix, 0, 15);
        assert matrix.read(0, 1) == 0;
        assert matrix.read(2, 2) == 0;
    }

}