package A2;

import java.util.ArrayList;

public class PriorityQueue <P extends Comparable<P>, D>{

	ArrayList<Object> piorityqueue;
	int size;
	
	private class Object <Comp extends Comparable<Comp>, D>{
		public Comp prio;
		public D daten;

		public Object(Comp prio,D daten){
			this.prio=prio;
			this.daten=daten;
		}
	}
	
	public PriorityQueue(){
		piorityqueue = new ArrayList<Object>();
		this.piorityqueue.add(null);
		this.size=0;
	}
	
	
	public int parent(int i){
		return i/2;
	}
	public int	left(int i){
		return i*2;
	}
	public int right(int i){
		return i*2+1;
	}
	public int heap_size(){
		return this.size;
	}
	public void dec_size(){
		this.size-=1;
	}

	public void max_heapify(int pos){
		int left_t = left(pos);
		int right_t = right(pos);
		if((left_t<=heap_size()) && (this.piorityqueue.get(left_t).prio>this.piorityqueue.get(pos).prio)){
		bigest = left_t
		}else{
		bigest = pos
		if right_t<=heap_size(H) and H[right_t]>H[bigest]:
		bigest = right_t
		if bigest != pos:
		H[pos], H[bigest] = H[bigest], H[pos]
		max_heapify( H, bigest )
	}

	
}
