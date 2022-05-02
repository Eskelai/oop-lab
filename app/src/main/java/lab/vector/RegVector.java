package lab.vector;

import java.util.Vector;

// Wrapper/Adapter over java.util.Vector
public class RegVector<T> implements IVector<T> {
    private Vector<T> vector;

    public RegVector(int size) {
        vector = new Vector<T>(size);
        vector.setSize(size); // Something is fishy here
    }

    public T read(int i) {
        return vector.elementAt(i);
    }

    public void write(int i, T value) {
        vector.setElementAt(value, i);
    }

    public int getSize() {
        return vector.size();
    }
}
