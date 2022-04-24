package lab.TestMatrix;

import org.junit.jupiter.api.Test;

import lab.matrix.MatrixInitiator;
import lab.matrix.RegularMatrix;

public class TestMatrixInitiator {

    @Test
    void InitializeMatrix() {
        RegularMatrix matrix = new RegularMatrix(3);
        MatrixInitiator.fill_matrix(matrix, 9, 15);
        assert matrix.read(0, 1) != 0;
        assert matrix.read(2, 2) != 0;
    }

    @Test
    void InitializeEmptyMatrix() {
        RegularMatrix matrix = new RegularMatrix(3);
        MatrixInitiator.fill_matrix(matrix, 0, 15);
        assert matrix.read(0, 1) == 0;
        assert matrix.read(2, 2) == 0;
    }

}