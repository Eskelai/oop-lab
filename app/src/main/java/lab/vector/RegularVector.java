package lab.vector;

import java.util.Vector;

// Wrapper/Adapter over java.util.Vector
public class RegularVector implements VectorInteface {
    private Vector<Integer> vector;

    public RegularVector(int size) {
        vector = new Vector<Integer>(size);
        vector.setSize(size); // New vector does not allocate size
    }

    public RegularVector(int[] members) {
        vector = new Vector<Integer>(members.length);

        for (int i = 0; i < members.length; i++) {
            this.write(members[i]);
        }
    }

    public int read(int index) {
        return vector.elementAt(index);
    }

    public void write(int i) {
        vector.addElement(i);
    }

    public int getSize() {
        return vector.size();
    }

    public void change(int index, int value) {
        vector.set(index, value);
    }

}
