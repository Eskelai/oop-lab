package lab.matrix;

import lab.vector.RegVector;

public class RegMatrix extends AbstractMatrix {
    public RegMatrix(int side_size) {
        matrix = new RegVector[side_size];
        for (int i = 0; i < side_size; i++) {
            matrix[i] = new RegVector(side_size);
        }
    }
}
