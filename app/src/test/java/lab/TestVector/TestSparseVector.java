package lab.TestVector;

import org.junit.jupiter.api.Test;

import lab.vector.SprVector;

class TestSparseVector {
    @Test
    void createVector() {
        new SprVector<Double>(1);
    }

    @Test
    void getVectorSize() {
        SprVector<Double> vector = new SprVector<Double>(1);
        assert vector.getSize() == 1;
    }

    @Test
    void readWriteVector() {
        SprVector<Integer> vector_integer = new SprVector<Integer>(1);
        vector_integer.write(0, 1);
        assert vector_integer.read(0) == 1;
    }

    @Test
    void overwriteValue() {
        SprVector<Integer> vector_integer = new SprVector<Integer>(1);
        vector_integer.write(0, 1);
        vector_integer.write(0, 2);
        assert vector_integer.read(0) == 2;
        assert vector_integer.getSize() == 1;
    }
}
