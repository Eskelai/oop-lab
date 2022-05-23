package lab.matrix_visual.schemes;

import lab.matrix.IMatrix;
import lab.matrix_visual.DrawerSchemeExternal;

public class CLIScheme implements DrawerSchemeExternal {
    protected boolean drawBorders;

    public CLIScheme() {
        drawBorders = true;
    }

    @Override
    public void draw(IMatrix matrix) {
        if (drawBorders)
            System.out.println("--------------------");

        int rowSize = matrix.getRowsAmount();
        int colSize = matrix.getColsAmount();

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.printf(matrix.read(i, j) + "\t");
            }
            System.out.printf("\n");
        }

        if (drawBorders)
            System.out.println("--------------------");
    }

    public boolean getBorders() {
        return drawBorders;
    }

    public void setBorders(boolean draw) {
        drawBorders = draw;
    }

}
