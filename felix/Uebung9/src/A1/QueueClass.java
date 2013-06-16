package A1;

import java.util.ArrayList;

public class QueueClass<Elem> implements Queue<Elem>{
	
	ArrayList<Elem> queue;
	
	public QueueClass(){
		this.queue = new ArrayList<Elem>();
	}
	
	@Override
	public void enqueue(Elem element) {
		this.queue.add(element);
		
	}

	@Override
	public Elem dequeue() throws EmptyQueueException {
		if(empty()){
			throw new EmptyQueueException();
		}
		else{
			Elem temp = this.queue.get(0);
			this.queue.remove(0);
			return temp;
		}
	}

	@Override
	public Elem first() throws EmptyQueueException {
		if(empty()){
			throw new EmptyQueueException();
		}
		else{
			Elem temp = this.queue.get(0);
			return temp;
		}
	}

	@Override
	public boolean empty() {
		if(this.queue.size()<=0)
			return true;
		else
			return false;
	}
	
	public String toString(){
		
		
		return null;
		
	}

}
