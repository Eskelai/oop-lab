package lab;

import lab.matrix.RegMatrix;
import lab.matrix.SprMatrix;
import lab.matrix.utils.*;
import lab.matrix_visual.MatrixDrawer;
import lab.matrix_visual.schemes.CLIScheme;
import lab.matrix_visual.schemes.GraphicalScheme;

public class App {

    private static void print_stats(MatrixStatistics stats) {
        System.out.println();
        System.out.println("Maximun value:" + stats.getMax());
        System.out.println("Medium value:" + stats.getMedium());
        System.out.println("Not null values:" + stats.getNotNull());
        System.out.println("Sum of all values:" + stats.getSum());
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        RegMatrix r_matrix = new RegMatrix(3);
        MatrixInitiator.fill_matrix(r_matrix, 9, 10);
        System.out.println("////STATS///////");
        System.out.println("Regular matrix is ready");

        SprMatrix s_matrix = new SprMatrix(3);
        MatrixInitiator.fill_matrix(s_matrix, 3, 10);
        System.out.println("Sparse matrix is ready");

        MatrixStatistics r_stats = new MatrixStatistics(r_matrix);
        MatrixStatistics s_stats = new MatrixStatistics(s_matrix);

        System.out.println("Regular:");
        App.print_stats(r_stats);

        System.out.println("Sparse:");
        App.print_stats(s_stats);

        System.out.println("///////////\n");

        System.out.println("////GRAPHICS/////");
        CLIScheme scheme_CLI = new CLIScheme();
        GraphicalScheme scheme_GUI = new GraphicalScheme();

        MatrixDrawer drawer = new MatrixDrawer(scheme_CLI);

        drawer.draw(r_matrix);

        MatrixScrambled decorated_matrix = new MatrixScrambled(r_matrix);
        decorated_matrix.moveNumbers();
        drawer.draw(decorated_matrix);
        System.out.println("\n");

        drawer.setDrawBorders(false);
        drawer.draw(decorated_matrix);

        System.out.println("/////////");
        // decorated_matrix.resetMatrix();
        // drawer.draw(decorated_matrix);

        // drawer.setScheme(scheme_GUI);
        // drawer.draw(decorated_matrix);
    }
}
