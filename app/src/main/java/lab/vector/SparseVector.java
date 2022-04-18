package lab.vector;

import java.util.Vector;

public class SparseVector implements VectorInteface {
    private Vector<Integer> vector;

    public SparseVector(int size) {
        vector = new Vector<Integer>(size);
    }

    public SparseVector(int[] members) throws IllegalArgumentException {
        vector = new Vector<Integer>(members.length);

        int amount_0 = 0;
        int amount_1 = 0;
        for (int i = 0; i < members.length; i++) {
            if (members[i] == 0) {
                amount_0 += 1;
            } else {
                amount_1 += 1;
            }
        }
        if (amount_1 > amount_0) {
            throw new IllegalArgumentException("Amount of 1 is greater than 0");
        }

        for (int i = 0; i < members.length; i++) {
            this.write(members[i]);
        }
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
