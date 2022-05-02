package lab.vector;

public interface IVector<T> {
    T read(int index);

    void write(int index, T value);

    int getSize();
}
