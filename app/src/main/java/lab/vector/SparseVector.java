package lab.vector;

import java.util.HashMap;
import java.util.TreeMap;

// https://www.geeksforgeeks.org/implementing-sparse-vector-in-java/
public class SparseVector<T> implements VectorInteface<T> {
    private HashMap<Integer, T> tm;
    private int size;

    public SparseVector(int size) {
        this.size = size;

        tm = new HashMap<Integer, T>();
    }

    public T read(int i) {
        if (i < 0 || i >= size)
            throw new RuntimeException("Vector out of bounds");

        if (tm.containsKey(i))
            return tm.get(i);
        else
            return null;

    }

    public void write(int i, T value) {
        if (i < 0 || i >= size)
            throw new RuntimeException("Vector out of bounds");

        tm.remove(i); // Remove previous value if it was there

        if (value.getClass().getName() == this.getClass().getName()) {
            tm.put(i, value);
            return;
        }

        if ((int) value != 0) { // FIXME: Value is generic. There's no way we can compare it
            tm.put(i, value);
        }
    }

    public int getSize() {
        return size;
    }

}
