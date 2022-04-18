package lab.vector;

import java.util.Vector;

public class SparseVector implements VectorInteface {
    private Vector<Object> vector;

    public SparseVector(int size) {
        vector = new Vector<Object>(size);
    }

    public SparseVector(int[] members) throws IllegalArgumentException {
        vector = new Vector<Object>(members.length);

        Integer amount_0 = 0;
        Integer amount_1 = 0;
        for (Integer i = 0; i < members.length; i++) {
            if (members[i] == 0) {
                amount_0 += 1;
            } else {
                amount_1 += 1;
            }
        }
        if (amount_1 > amount_0) {
            throw new IllegalArgumentException("Amount of 1 is greater than 0");
        }

        for (Integer i = 0; i < members.length; i++) {
            this.write(members[i]);
        }
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
