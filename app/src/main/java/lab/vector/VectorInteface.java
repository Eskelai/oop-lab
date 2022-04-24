package lab.vector;

public interface VectorInteface<T> {
    T read(int index);

    void write(int index, T value);

    int getSize();
}
