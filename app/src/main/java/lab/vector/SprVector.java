// https://www.geeksforgeeks.org/implementing-sparse-vector-in-java/
package lab.vector;

import java.util.HashMap;

public class SprVector<T> implements IVector<T> {
    private HashMap<Integer, T> hm;
    private int size;

    public SprVector(int size) {
        hm = new HashMap<Integer, T>();
        this.size = size;
    }

    public T read(int i) {
        if (i < 0 || i >= size)
            throw new RuntimeException("Vector out of bounds");

        if (hm.containsKey(i))
            return hm.get(i);
        else
            return null;

    }

    public void write(int i, T value) {
        if (i < 0 || i >= size)
            throw new RuntimeException("Vector out of bounds");

        hm.remove(i); // Remove previous value if it was there

        if (value.getClass().getName() == this.getClass().getName()) {
            hm.put(i, value);
            return;
        }

        if ((int) value != 0) { // FIXME: Value is generic. There's no way we can compare it
            hm.put(i, value);
        }
    }

    public int getSize() {
        return size;
    }

}
