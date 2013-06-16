package A1;

public class EmptyQueueException extends Exception{
	public EmptyQueueException(){
		super("Queue ist leer. Man kann nichts entfernen oder lesen");
	}
}
