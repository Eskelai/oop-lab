package lab;

import java.util.Vector;

public class RegularVector implements VectorInteface {
    private Vector<Object> vector;

    public RegularVector(int size) {
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
