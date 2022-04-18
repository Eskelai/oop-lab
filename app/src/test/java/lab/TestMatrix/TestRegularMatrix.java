package lab.TestMatrix;

import org.junit.jupiter.api.Test;

import lab.matrix.RegularMatrix;
import lab.vector.RegularVector;
import lab.vector.SparseVector;

import static org.junit.jupiter.api.Assertions.*;

public class TestRegularMatrix {

    @Test
    void createRndRegular() {
        int[] val_1 = new int[] { 1, 2, 3, 4, 5 };
        RegularVector vector_1 = new RegularVector(val_1);

        int[] val_2 = new int[] { 6, 7, 8, 9, 10 };
        RegularVector vector_2 = new RegularVector(val_2);
        RegularMatrix matrix = new RegularMatrix(10);
        assert (matrix.getColsAmount() > 0);
        assert (matrix.getRowsAmount() > 0);
    }

}
