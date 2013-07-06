package klausur;

/**
 * Implementiere folgende Trees
 *
 * HEAP
 * B-Baum
 * Aubalancierter Binärbaum
 *
 */
public interface Tree extends Iterable<Tree>{

    boolean isBalanced();

    void insert(int x);

    void deleteRoot();

    boolean hasValue(int x);

    int find(int x);

    int size();

    int depth();
}
