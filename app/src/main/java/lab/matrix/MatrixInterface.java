package lab.matrix;

public interface MatrixInterface {
    int getColsAmount();

    int getRowsAmount();

    int read(int col_id, int row_id);

    void write(int col_id, int row_id, int value);
}
