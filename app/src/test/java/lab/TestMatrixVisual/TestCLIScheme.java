package lab.TestMatrixVisual;

import org.junit.jupiter.api.Test;

import lab.matrix.MatrixInitiator;
import lab.matrix.RegularMatrix;
import lab.matrix_visual.MatrixDrawer;
import lab.matrix_visual.schemes.CLIScheme;

public class TestCLIScheme {

    @Test
    public void drawScheme() {
        CLIScheme scheme = new CLIScheme();
        MatrixDrawer drawer = new MatrixDrawer(scheme);

        RegularMatrix matrix = new RegularMatrix(2);
        MatrixInitiator.fill_matrix(matrix, 4, 10);

        drawer.draw(matrix);
    }

}
