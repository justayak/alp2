package a9;

/**
 * Created with IntelliJ IDEA.
 * User: Baka
 * Date: 16.06.13
 * Time: 21:04
 * To change this template use File | Settings | File Templates.
 */
public final class ImplQueue<E> implements Queue<E>{

    public final int DEFAULT_CAP = 10;
    private int capacity, current, head, tail;
    private E[] array;

    public ImplQueue(){
        this.capacity = DEFAULT_CAP;
        this.array = (E[]) new Object[DEFAULT_CAP];
        this.tail = -1;
        this.head = 0;
    }

    @Override
    public void enq(E element) {

    }

    @Override
    public E deq() throws EmptyQueueException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public E first() throws EmptyQueueException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean empty() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
