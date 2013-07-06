package klausur;

/**
 * Implementiere
 *
 *
 * Queue
 * Stack
 *
 */
public interface YuList<T> {

    int size();

    void insert(T x);
    void insert(T x, int pos);

    T at(int pos);

    void delete(int pos);

    void delete(T x);

    boolean isEmpty();

}
