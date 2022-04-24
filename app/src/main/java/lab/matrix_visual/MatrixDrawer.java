package lab.matrix_visual;

import lab.matrix.MatrixInterface;

public class MatrixDrawer {
    DrawerScheme scheme;
    boolean draw_borders;

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

    public void draw(MatrixInterface matrix) {
        scheme.draw(matrix, draw_borders);
    }

}
