package lab.TestMatrix;

import org.junit.jupiter.api.Test;

import lab.matrix.RegularMatrix;

public class TestRegularMatrix {
    @Test
    void createMatrix() {
        RegularMatrix matrix = new RegularMatrix(3);
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

    // @Test
    // void readMatrix() {
    // RegularMatrix matrix = new RegularMatrix(3);
    // assertNotNull(matrix.read(1, 1));
    // }

    // @Test
    // void writeMatrix() {
    // RegularMatrix matrix = new RegularMatrix(3);
    // matrix.write(1, 1, 1010);
    // assert (matrix.read(1, 1) == 1010);
    // }

}
