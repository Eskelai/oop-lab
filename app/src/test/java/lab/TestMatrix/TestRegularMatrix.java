package lab.TestMatrix;

import org.junit.jupiter.api.Test;

import lab.matrix.RegMatrix;

public class TestRegularMatrix {
    @Test
    void createMatrix() {
        new RegMatrix(3);
    }

    @Test
    void getColumns() {
        RegMatrix matrix = new RegMatrix(3);
        assert matrix.getColsAmount() == 3;
    }

    @Test
    void getRows() {
        RegMatrix matrix = new RegMatrix(3);
        assert matrix.getRowsAmount() == 3;
    }

    @Test
    void readWriteMatrix() {
        RegMatrix matrix = new RegMatrix(2);
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
}
