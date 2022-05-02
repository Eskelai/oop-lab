package lab.matrix_visual.schemes;

import lab.matrix.IMatrix;
import lab.matrix_visual.DrawerScheme;

public class CLIScheme implements DrawerScheme {

    @Override
    public void draw(IMatrix matrix, boolean draw_borders) {
        if (draw_borders)
            System.out.println("--------------------");

        int rowSize = matrix.getRowsAmount();
        int colSize = matrix.getColsAmount();

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.printf(matrix.read(i, j) + "\t");
            }
            System.out.printf("\n");
        }

        if (draw_borders)
            System.out.println("--------------------");
    }
}
