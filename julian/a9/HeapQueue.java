package a9;

/**
 * Created with IntelliJ IDEA.
 * User: Baka
 * Date: 16.06.13
 * Time: 21:13
 * To change this template use File | Settings | File Templates.
 */
public final class HeapQueue<P extends Comparable<P>,D> {

    private final int CAPACITY = 10;
    private int capacity;
    private Data<P,D>[] array;

    public HeapQueue(){
        this.array = ( Data<P,D>[]) new Object[CAPACITY];
        this.capacity = CAPACITY;
    }

    public void store(P prority, D data){

    }

    public D remove() throws Queue.EmptyQueueException{
        return null;
    }

    public D highest() throws Queue.EmptyQueueException{
        return null;
    }

    // ========================
    // P R I V A T E
    // ========================

    private void resize(){
        Data[] newArray = (Data[]) new Object[2*this.capacity];
    }

    private int left(int i){
        return i*2+1;
    }

    private int right(int i){
        return i*2+2;
    }

    private int parent(int i){
        return (i/2)-1;
    }

    private class Data<P extends Comparable<P>,D> implements Comparable<Data<P,D>> {
        public final P Key;
        public final D Data;

        public Data(P key, D data){
            this.Key = key;
            this.Data = data;
        }

        @Override
        public int compareTo(HeapQueue.Data o) {
            return this.Key.compareTo((P)o.Key);
        }
    }

}
