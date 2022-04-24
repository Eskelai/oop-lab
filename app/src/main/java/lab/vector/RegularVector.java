package lab.vector;

import java.util.Vector;

// Wrapper/Adapter over java.util.Vector
public class RegularVector<T> implements VectorInteface<T> {
    private Vector<T> vector;

    public RegularVector(int size) {
        vector = new Vector<T>(size);
        vector.setSize(size); // Something is fishy here
    }

    public T read(int index) {
        return vector.elementAt(index);
    }

    public void write(int index, T value) {
        vector.setElementAt(value, index);
    }

    public int getSize() {
        return vector.size();
    }
}
