package lab;

import lab.matrix.IMatrix;
import lab.matrix.RegMatrix;
import lab.matrix.SprMatrix;
import lab.matrix.utils.*;
import lab.matrix_visual.MatrixDrawer;
import lab.matrix_visual.schemes.CLIScheme;
import lab.matrix_visual.schemes.GraphicalScheme;

public class App {
    private static void print_stats(MatrixStatistics stats) {
        System.out.println("Max val: " + stats.getMax());
        System.out.println("Med val: " + stats.getMedium());
        System.out.println("Not null val: " + stats.getNotNull());
        System.out.println("Sum of all val: " + stats.getSum());
    }

    private static void get_stats(IMatrix m1, IMatrix m2) {
        MatrixStatistics r_stats = new MatrixStatistics(m1);
        MatrixStatistics s_stats = new MatrixStatistics(m2);

        System.out.println("First matrix (regular):");
        App.print_stats(r_stats);
        System.out.println("Second matrix (sparse):");
        App.print_stats(s_stats);
    }

    private static void draw_graphics(IMatrix m, boolean draw_borders) {
        CLIScheme scheme_CLI = new CLIScheme();
        GraphicalScheme scheme_GUI = new GraphicalScheme();

        MatrixDrawer drawer = new MatrixDrawer(scheme_CLI);
        if (!draw_borders) {
            drawer.setBorders(false);
        }

        drawer.draw(m);
    }

    private static void use_decorator(IMatrix m) {
        MatrixScrambled decorated_matrix = new MatrixScrambled(m);
        decorated_matrix.moveNumbers();
        App.draw_graphics(m, false);
    }

    public static void main(String[] args) throws Exception {
        RegMatrix r_matrix = new RegMatrix(3);
        MatrixInitiator.fill_matrix(r_matrix, 9, 10);
        SprMatrix s_matrix = new SprMatrix(3);
        MatrixInitiator.fill_matrix(s_matrix, 3, 10);

        System.out.println("\nSTATS:\n");
        App.get_stats(r_matrix, s_matrix);
        System.out.println("\nGRAPHICS:\n");
        System.out.println("With borders:");
        App.draw_graphics(r_matrix, true);
        System.out.println("Without borders:");
        App.draw_graphics(r_matrix, false);

        System.out.println("\nDECORATOR:\n");
        App.use_decorator(r_matrix);
    }
}
