package lab.TestVector;

import org.junit.jupiter.api.Test;

import lab.vector.RegularVector;

class TestRegularVector {
    @Test
    void createVector() {
        new RegularVector<Double>(1);
    }

    @Test
    void getVectorSize() {
        RegularVector<Double> vector = new RegularVector<Double>(1);
        assert vector.getSize() == 1;
    }

    @Test
    void readWriteVector() {
        RegularVector<Integer> vector = new RegularVector<Integer>(1);
        vector.write(0, 1);
        assert vector.read(0) == 1;
    }

    @Test
    void overwriteValue() {
        RegularVector<Integer> vector = new RegularVector<Integer>(1);
        vector.write(0, 1);
        vector.write(0, 2);
        assert vector.read(0) == 2;
        assert vector.getSize() == 1;
    }
}
