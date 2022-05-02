package lab.TestMatrixVisual;

import org.junit.jupiter.api.Test;

import lab.matrix.RegMatrix;
import lab.matrix.utils.MatrixInitiator;
import lab.matrix_visual.MatrixDrawer;
import lab.matrix_visual.schemes.CLIScheme;

public class TestCLIScheme {

    @Test
    public void drawScheme() {
        CLIScheme scheme = new CLIScheme();
        MatrixDrawer drawer = new MatrixDrawer(scheme);

        RegMatrix matrix = new RegMatrix(2);
        MatrixInitiator.fill_matrix(matrix, 4, 10);

        drawer.draw(matrix);
    }

}
