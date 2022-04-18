package lab.TestVector;

import org.junit.jupiter.api.Test;

import lab.vector.SparseVector;

import static org.junit.jupiter.api.Assertions.*;

class TestSparseVector {
    int[] members = new int[] { 1, 2, 0, 0, 0 };

    @Test
    void createVector() {
        new SparseVector(members);
    }

    @Test
    void readVector() {
        SparseVector vector = new SparseVector(members);
        assert (vector.read(0) == 1);
        assert (vector.read(4) == 0);

    }

    @Test
    void writeVector() {
        SparseVector vector = new SparseVector(members);
        vector.write(10);
        assert (vector.read(5) == 10);

    }

    @Test
    void getSize() {
        SparseVector vector = new SparseVector(members);
        assert (vector.getSize() > 0);

    }

    @Test
    void badArgs() {
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
