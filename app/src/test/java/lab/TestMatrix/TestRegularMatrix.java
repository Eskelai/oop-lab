package lab.TestMatrix;

import org.junit.jupiter.api.Test;

import lab.matrix.RegularMatrix;

import static org.junit.jupiter.api.Assertions.*;

public class TestRegularMatrix {
    @Test
    void createMatrix() {
        new RegularMatrix(10);
    }

    @Test
    void getColumns() {
        RegularMatrix matrix = new RegularMatrix(10);
        assert (matrix.getColsAmount() == 10);
    }

    @Test
    void getRows() {
        RegularMatrix matrix = new RegularMatrix(10);
        assert (matrix.getRowsAmount() == 10);
    }

    @Test
    void readMatrix() {
        RegularMatrix matrix = new RegularMatrix(10);
        assertNotNull(matrix.read(1, 1));
    }

    @Test
    void writeMatrix() {
        RegularMatrix matrix = new RegularMatrix(10);
        matrix.write(1, 1, 1010);
        assert (matrix.read(1, 1) == 1010);
    }

}
