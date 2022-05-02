package lab.TestMatrix;

import org.junit.jupiter.api.Test;

import lab.matrix.SprMatrix;

public class TestSparseMatrix {
    @Test
    void createMatrix() {
        new SprMatrix(3);
    }

    @Test
    void getColumns() {
        SprMatrix matrix = new SprMatrix(3);
        assert matrix.getColsAmount() == 3;
    }

    @Test
    void getRows() {
        SprMatrix matrix = new SprMatrix(3);
        assert matrix.getRowsAmount() == 3;
    }

    @Test
    void readWriteMatrix() {
        SprMatrix matrix = new SprMatrix(2);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix.write(i, j, 1);
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assert matrix.read(i, j) == 1;
            }
        }

    }

    @Test
    void readWriteMatrixNullValues() {
        SprMatrix matrix = new SprMatrix(2);

        matrix.write(0, 0, 0);
        matrix.write(0, 1, 0);
        matrix.write(1, 0, 0);
        matrix.write(1, 1, 1);

        assert matrix.read(0, 0) == 0;
        assert matrix.read(0, 1) == 0;
        assert matrix.read(1, 0) == 0;
        assert matrix.read(1, 1) == 1;

    }
}
