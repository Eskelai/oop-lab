package lab.matrix;

import lab.vector.RegularVector;
import lab.vector.VectorInteface;

public abstract class MatrixAbstract implements MatrixInterface {
    public VectorInteface vector;

    public MatrixAbstract() {
        vector = new RegularVector(10);
    }
}
