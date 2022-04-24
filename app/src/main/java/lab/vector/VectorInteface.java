package lab.vector;

public interface VectorInteface<T> {
    Object read(int index);

    void write(int index, T value);

    int getSize();
}
