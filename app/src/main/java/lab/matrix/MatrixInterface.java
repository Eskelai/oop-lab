package lab.matrix;

//https://stackoverflow.com/questions/35240044/how-to-represent-a-2d-matrix-in-java
public interface MatrixInterface {
    // int cols_amount = -1;
    // int rows_amount = -1;

    int getColsAmount();

    int getRowsAmount();

    void read();

    void write();

}
