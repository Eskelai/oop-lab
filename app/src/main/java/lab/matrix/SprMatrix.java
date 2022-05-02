package lab.matrix;

import lab.vector.SprVector;

public class SprMatrix extends AbstractMatrix {
    public SprMatrix(int side_size) {
        matrix = new SprVector[side_size];
        for (int i = 0; i < side_size; i++) {
            matrix[i] = new SprVector(side_size);
        }
    }
}
