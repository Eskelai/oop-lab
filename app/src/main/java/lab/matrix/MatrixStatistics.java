package lab.matrix;

public class MatrixStatistics {
    private MatrixInterface matrix;

    public MatrixStatistics(MatrixInterface matrix) {
        this.matrix = matrix;
    }

    public int getSum() {
        int sum = 0;
        for (int i = 0; i < matrix.getColsAmount(); i++) {
            for (int j = 0; j < matrix.getRowsAmount(); j++) {
                sum += matrix.read(i, j);
            }
        }
        return sum;
    }

    public int getMedium() {
        int sum = getSum();
        int medium = sum / (matrix.getColsAmount() * matrix.getRowsAmount());

        return medium;
    }

    public int getNotNull() {
        int not_null = 0;
        for (int i = 0; i < matrix.getColsAmount(); i++) {
            for (int j = 0; j < matrix.getRowsAmount(); j++) {
                if (matrix.read(i, j) != 0) {
                    not_null += 1;
                }
            }
        }
        return not_null;
    }

    public int getMax() {
        int max = matrix.read(1, 1);
        for (int i = 0; i < matrix.getColsAmount(); i++) {
            for (int j = 0; j < matrix.getRowsAmount(); j++) {
                int val = matrix.read(i, j);
                if (val > max) {
                    max = val;
                }
            }
        }
        return max;
    }
}
