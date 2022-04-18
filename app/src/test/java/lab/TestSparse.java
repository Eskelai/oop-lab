package lab;

import org.junit.jupiter.api.Test;

import lab.vector.SparseVector;

import static org.junit.jupiter.api.Assertions.*;

class TestSparse {
    @Test
    void createSparse() {
        int[] members = new int[] { 1, 2, 0, 0, 0 };
        new SparseVector(members);
    }

    @Test
    void incorrectSparse() {
        int[] members = new int[] { 1, 2, 3, 0, 0 };
        boolean raised_expection = false;
        try {
            new SparseVector(members);
        } catch (Exception e) {
            raised_expection = true;
            assert (e instanceof IllegalArgumentException);
        }

        assert (raised_expection);
    }
}
