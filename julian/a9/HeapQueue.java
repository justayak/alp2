package a9;

/**
 * Created with IntelliJ IDEA.
 * User: Baka
 * Date: 16.06.13
 * Time: 21:13
 * To change this template use File | Settings | File Templates.
 */
public class HeapQueue<P extends Comparable<P>,D> {

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

    private class Data<P extends Comparable<P>,D>{
        public final P Key;
        public final D Data;

        public Data(P key, D data){
            this.Key = key;
            this.Data = data;
        }
    }

}
