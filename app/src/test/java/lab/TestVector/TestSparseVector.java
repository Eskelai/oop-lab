package lab.TestVector;

import org.junit.jupiter.api.Test;

import lab.vector.SparseVector;

import static org.junit.jupiter.api.Assertions.*;

class TestSparseVector {
    @Test
    void createVector() {
        SparseVector<Double> vector = new SparseVector<Double>(1);
    }

    @Test
    void getVectorSize() {
        SparseVector<Double> vector = new SparseVector<Double>(1);
        assert vector.getSize() == 1;
    }

    @Test
    void readWriteVector() {
        SparseVector<Integer> vector_integer = new SparseVector<Integer>(1);
        vector_integer.write(0, 1);
        assert vector_integer.read(0) == 1;
    }

    @Test
    void overwriteValue() {
        SparseVector<Integer> vector_integer = new SparseVector<Integer>(1);
        vector_integer.write(0, 1);
        vector_integer.write(0, 2);
        assert vector_integer.read(0) == 2;
        assert vector_integer.getSize() == 1;
    }
}
