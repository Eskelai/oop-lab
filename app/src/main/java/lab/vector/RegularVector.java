package lab.vector;

import java.util.Vector;

public class RegularVector implements VectorInteface {
    private Vector<Integer> vector;

    public RegularVector(int size) {
        vector = new Vector<Integer>(size);
    }

    public int read(int index) {
        return vector.get(index);
    }

    public void write(int i) {
        vector.addElement(i);
    }

    public int getSize() {
        return vector.size();
    }

}
