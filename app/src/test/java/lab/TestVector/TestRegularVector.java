package lab.TestVector;

import org.junit.jupiter.api.Test;

import lab.vector.RegVector;

class TestRegularVector {
    @Test
    void createVector() {
        new RegVector(1);
    }

    @Test
    void getVectorSize() {
        RegVector vector = new RegVector(1);
        assert vector.getSize() == 1;
    }

    @Test
    void readWriteVector() {
        RegVector vector = new RegVector(1);
        vector.write(0, 1);
        assert vector.read(0) == 1;
    }

    @Test
    void overwriteValue() {
        RegVector vector = new RegVector(1);
        vector.write(0, 1);
        vector.write(0, 2);
        assert vector.read(0) == 2;
        assert vector.getSize() == 1;
    }
}
