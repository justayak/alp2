package a9;

/**
 * Created with IntelliJ IDEA.
 * User: Baka
 * Date: 16.06.13
 * Time: 21:01
 * To change this template use File | Settings | File Templates.
 */
public interface Queue <E>{
    public void enq(E element);
    public E deq() throws EmptyQueueException;
    public E first() throws EmptyQueueException;
    public boolean empty();
    public String toString();

    public class EmptyQueueException extends Exception{
        public EmptyQueueException(){
            super("Queue ist leer. Man kann nichts entfernen oder lesen");
        }
    }
}
