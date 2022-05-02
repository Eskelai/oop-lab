package lab.matrix;

public interface IMatrix {
    int read(int col_id, int row_id);

    void write(int col_id, int row_id, int value);

    int getColsAmount();

    int getRowsAmount();
}
