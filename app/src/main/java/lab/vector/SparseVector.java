package lab.vector;

import java.util.Vector;

public class SparseVector implements VectorInteface {
    private Vector<Object> vector;

    public SparseVector(int size) {
        vector = new Vector<Object>(size);
    }

    public Object read(int index) {
        return vector.get(index);
    }

    public void write(Object o) {
        vector.addElement(o);
    }

    public int getSize() {
        return vector.size();
    }

}
