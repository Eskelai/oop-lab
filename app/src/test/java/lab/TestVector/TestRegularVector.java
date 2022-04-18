package lab.TestVector;

import org.junit.jupiter.api.Test;

import lab.vector.RegularVector;

import static org.junit.jupiter.api.Assertions.*;

class TestRegularVector {
    int[] members = new int[] { 1, 2, 0, 0, 0 };

    @Test
    void createVector() {
        new RegularVector(members);
    }

    @Test
    void readVector() {
        RegularVector vector = new RegularVector(members);
        assert (vector.read(0) == 1);
        assert (vector.read(4) == 0);

    }

    @Test
    void writeVector() {
        RegularVector vector = new RegularVector(members);
        vector.write(10);
        assert (vector.read(5) == 10);

    }

    @Test
    void changeVector() {
        RegularVector vector = new RegularVector(members);
        vector.write(10);
        assert (vector.read(5) == 10);
        vector.change(5, 1010);
        assert (vector.read(5) == 1010);

    }

    @Test
    void getSize() {
        RegularVector vector = new RegularVector(members);
        assert (vector.getSize() > 0);

    }
}
