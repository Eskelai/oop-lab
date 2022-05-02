// https://www.geeksforgeeks.org/implementing-sparse-vector-in-java/
package lab.vector;

import java.util.HashMap;

public class SprVector implements IVector {
    private HashMap<Integer, Integer> hm;
    private int size;

    public SprVector(int size) {
        hm = new HashMap<Integer, Integer>();
        this.size = size;
    }

    public int read(int i) {
        if (i < 0 || i >= size)
            throw new RuntimeException("Vector out of bounds");

        if (hm.containsKey(i))
            return hm.get(i);

        return 0;
    }

    public void write(int i, int value) {
        if (i < 0 || i >= size)
            throw new RuntimeException("Vector out of bounds");
        hm.remove(i); // Remove previous value if it was there
        if (value != 0) {
            hm.put(i, value);
        }
    }

    public int getSize() {
        return size;
    }

}
