package lab.matrix_visual;

import lab.matrix.IMatrix;

public class MatrixDrawer {
    private DrawerScheme scheme;
    private boolean draw_borders;

    public MatrixDrawer(DrawerScheme scheme) {
        this.scheme = scheme;
        draw_borders = true;
    }

    public void setScheme(DrawerScheme scheme) {
        this.scheme = scheme;
    }

    public void setDrawBorders(boolean draw_borders) {
        this.draw_borders = draw_borders;
    }

    public void draw(IMatrix matrix) {
        scheme.draw(matrix, draw_borders);
    }

}
