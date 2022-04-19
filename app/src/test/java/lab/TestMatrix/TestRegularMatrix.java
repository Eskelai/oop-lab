package lab.TestMatrix;

import org.junit.jupiter.api.Test;

import lab.matrix.RegularMatrix;

import static org.junit.jupiter.api.Assertions.*;

public class TestRegularMatrix {
    @Test
    void createMatrix() {
        RegularMatrix matrix = new RegularMatrix(10);

        boolean ex_caught = false;
        try {
            // Make sure that matrix is empty
            matrix.read(0, 0);
        } catch (Exception e) {
            ex_caught = true;
        }
        assert ex_caught;

        matrix.write(1, 1, 10);
        matrix.write(3, 3, 30);
        assert (matrix.read(1, 1) == 10);
        assert (matrix.read(3, 3) == 30);
    }

    @Test
    void createRndMatrix() {
        new RegularMatrix(10, true);
    }

    @Test
    void getColumns() {
        RegularMatrix matrix = new RegularMatrix(10, true);
        assert (matrix.getColsAmount() == 10);
    }

    @Test
    void getRows() {
        RegularMatrix matrix = new RegularMatrix(10, true);
        assert (matrix.getRowsAmount() == 10);
    }

    @Test
    void readMatrix() {
        RegularMatrix matrix = new RegularMatrix(10, true);
        assertNotNull(matrix.read(1, 1));
    }

    @Test
    void writeMatrix() {
        RegularMatrix matrix = new RegularMatrix(10, true);
        matrix.write(1, 1, 1010);
        assert (matrix.read(1, 1) == 1010);
    }

}
