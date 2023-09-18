public interface MultiSet<T> {
    boolean add(T item);

    void remove(T item);

    boolean contains(T item);

    boolean is_empty();

    boolean count(T item);

    int size();
}