package lab.TestMatrix;

import org.junit.jupiter.api.Test;

import lab.matrix.SparseMatrix;
import lab.vector.RegularVector;
import lab.vector.SparseVector;

import static org.junit.jupiter.api.Assertions.*;

public class TestSparseMatrix {
    @Test
    void createMatrix() {
        new SparseMatrix(10);
    }

    @Test
    void getColumns() {
        SparseMatrix matrix = new SparseMatrix(10);
        assert (matrix.getColsAmount() == 10);
    }

    @Test
    void getRows() {
        SparseMatrix matrix = new SparseMatrix(10);
        assert (matrix.getRowsAmount() == 10);
    }

    @Test
    void readMatrix() {
        SparseMatrix matrix = new SparseMatrix(10);
        assertNotNull(matrix.read(1, 1));
    }

    @Test
    void writeMatrix() {
        SparseMatrix matrix = new SparseMatrix(10);
        matrix.write(1, 1, 1010);
        assert (matrix.read(1, 1) == 1010);
    }

}
