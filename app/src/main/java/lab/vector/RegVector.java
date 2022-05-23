package lab.vector;

import java.util.Vector;

// Wrapper/Adapter over java.util.Vector
public class RegVector implements IVector {
    private Vector<Integer> vector;

    public RegVector(int size) {
        vector = new Vector<Integer>(size);
        vector.setSize(size);
    }

    public int read(int i) {
        return vector.elementAt(i);
    }

    public void write(int i, int value) {
        vector.setElementAt(value, i);
    }

    public int getSize() {
        return vector.size();
    }
}
