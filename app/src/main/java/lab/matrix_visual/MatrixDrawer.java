package lab.matrix_visual;

import lab.matrix.IMatrix;

public class MatrixDrawer {
    private DrawerSchemeExternal scheme;

    public MatrixDrawer(DrawerSchemeExternal scheme) {
        this.scheme = scheme;
    }

    public void setScheme(DrawerSchemeExternal scheme) {
        this.scheme = scheme;
    }

    public void setBorders(boolean draw_borders) {
        scheme.setBorders(draw_borders);
    }

    public void draw(IMatrix matrix) {
        scheme.draw(matrix);
    }

}
