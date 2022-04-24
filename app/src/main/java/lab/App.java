package lab;

import lab.matrix.MatrixInitiator;
import lab.matrix.MatrixStatistics;
import lab.matrix.NumberDecorator;
import lab.matrix.RegularMatrix;
import lab.matrix.SparseMatrix;
import lab.matrix_visual.MatrixDrawer;
import lab.matrix_visual.schemes.CLIScheme;

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
        System.out.println("//////////////////");
        System.out.println("Main");
        System.out.println("//////////////////");

        RegularMatrix r_matrix = new RegularMatrix(2);
        MatrixInitiator.fill_matrix(r_matrix, 2, 10);
        System.out.println("Regular matrix is ready");

        SparseMatrix s_matrix = new SparseMatrix(2);
        MatrixInitiator.fill_matrix(s_matrix, 2, 10);
        System.out.println("Sparse matrix is ready");

        MatrixStatistics r_stats = new MatrixStatistics(r_matrix);
        MatrixStatistics s_stats = new MatrixStatistics(s_matrix);

        System.out.println("Regular:");
        App.print_stats(r_stats);

        System.out.println("Sparse:");
        App.print_stats(s_stats);

        CLIScheme scheme = new CLIScheme();
        MatrixDrawer drawer = new MatrixDrawer(scheme);

        drawer.draw(r_matrix);

        NumberDecorator decorated_matrix = new NumberDecorator(r_matrix);
        decorated_matrix.moveNumbers();
        drawer.draw(decorated_matrix);
        decorated_matrix.resetMatrix();
        drawer.draw(decorated_matrix);
    }
}
