package lab.TestMatrix;

import org.junit.jupiter.api.Test;

import lab.matrix.RegularMatrix;

public class TestRegularMatrix {
    @Test
    void createMatrix() {
        new RegularMatrix(3);
    }

    @Test
    void getColumns() {
        RegularMatrix matrix = new RegularMatrix(3);
        assert matrix.getColsAmount() == 3;
    }

    @Test
    void getRows() {
        RegularMatrix matrix = new RegularMatrix(3);
        assert matrix.getRowsAmount() == 3;
    }

    @Test
    void readWriteMatrix() {
        RegularMatrix matrix = new RegularMatrix(2);
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
