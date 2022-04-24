package lab.vector;

import java.util.TreeMap;

// https://www.geeksforgeeks.org/implementing-sparse-vector-in-java/
public class SparseVector<T> implements VectorInteface<T> {
    private TreeMap<Integer, T> st;
    private int size;

    public SparseVector(int size) {
        this.size = size;

        st = new TreeMap<Integer, T>();
    }

    public T read(int i) {
        if (i < 0 || i >= size)
            throw new RuntimeException("Vector out of bounds");

        if (st.containsKey(i))
            return st.get(i);
        else
            return null;

    }

    public void write(int i, T value) {
        if (i < 0 || i >= size)
            throw new RuntimeException("Vector out of bounds");

        if ((int) value == 0) { // FIXME: How can this be generalized
            st.remove(i);
        } else {
            st.put(i, value);
        }
    }

    public int getSize() {
        return size;
    }

}
