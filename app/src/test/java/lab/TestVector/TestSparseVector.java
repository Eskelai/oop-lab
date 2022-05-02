package lab.TestVector;

import org.junit.jupiter.api.Test;

import lab.vector.SprVector;

class TestSparseVector {
    @Test
    void createVector() {
        new SprVector(1);
    }

    @Test
    void getVectorSize() {
        SprVector vector = new SprVector(1);
        assert vector.getSize() == 1;
    }

    @Test
    void readWriteVector() {
        SprVector vector_integer = new SprVector(1);
        vector_integer.write(0, 1);
        assert vector_integer.read(0) == 1;
    }

    @Test
    void overwriteValue() {
        SprVector vector_integer = new SprVector(1);
        vector_integer.write(0, 1);
        vector_integer.write(0, 2);
        assert vector_integer.read(0) == 2;
        assert vector_integer.getSize() == 1;
    }
}
