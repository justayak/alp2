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
    private int current = -1;

    public HeapQueue(){
        this.array = new Data[CAPACITY];
        this.capacity = CAPACITY;
    }

    public void store(P prority, D data){
        Data<P,D> e = new Data<P, D>(prority,data);
        this.current += 1;
        this.array[this.current] = e;
        this.heapify(this.current);
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

    private void heapify(){

    }

    private void heapify(int p){
        int left = this.left(p);
        int right = this.right(p);
        int biggest = -1;
        int heapSize = current;
        if (left <= heapSize && (this.array[left].greater(this.array[p]))){
            biggest = left;
        }else {
            biggest = p;
        }

        if (right <= heapSize && (this.array[right].greater(this.array[biggest]))){
            biggest = right;
        }

        if (biggest != p){
            Data<P,D> temp = this.array[biggest];
            this.array[biggest] = this.array[p];
            this.array[p] = temp;
        }
    }

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

        public boolean greater(HeapQueue.Data o){
            return this.compareTo(o) >= 1;
        }

        public boolean less(HeapQueue.Data o){
            return this.compareTo(o) <= -1;
        }

        public boolean equal(HeapQueue.Data o){
            return this.compareTo(o) == 0;
        }

        public boolean greaterEqual(HeapQueue.Data o){
            return this.compareTo(o) >= 0;
        }

        public boolean lessEqual(HeapQueue.Data o){
            return this.compareTo(o) <= 0;
        }

        @Override
        public int compareTo(HeapQueue.Data o) {
            return this.Key.compareTo((P)o.Key);
        }
    }

}
