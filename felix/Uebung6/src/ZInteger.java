package src;

public class ZInteger {
	private int x;
	private int y;
	
	public ZInteger(int x,int y){
		this.x=x;
		this.y=y;
	}
	public ZInteger add(ZInteger b){
		int x=this.x+b.X();
		int y=this.y+b.Y();
		ZInteger c = new ZInteger(x,y);
		c.simplify();
		return c;
	}

	public ZInteger sub(ZInteger b){
		int x=this.x+b.Y();
		int y=this.y+b.X();
		ZInteger c = new ZInteger(x,y);
		c.simplify();
		return c;
	}
	
	public ZInteger mul(ZInteger b){
		int x=this.x*b.X()+this.y*b.Y();
		int y=this.x*b.Y()+this.y*b.X();
		ZInteger c = new ZInteger(x,y);
		c.simplify();
		return c;
	}
	
	public boolean equal(ZInteger b){
		return this.x+b.Y()==b.X()+this.y;
	}
	
	public boolean less(ZInteger b){
		return this.x+b.Y()<b.X()+this.y;
	}
	
	public boolean greater(ZInteger b){
		return this.x+b.Y()>b.X()+this.y;
	}
	
	public boolean lessEqual(ZInteger b){
		return this.x+b.Y()<=b.X()+this.y;
	}
	
	public boolean greaterEqual(ZInteger b){
		return this.x+b.Y()>=b.X()+this.y;
	}
	
	public String toString(){
		return "("+x+","+y+")";
	}
	
	public void simplify(){
		if(this.x<this.y){
			this.y=this.y-this.x;			
			this.x=0;
		}
		else if(this.y<this.x){
			this.x=this.x-this.y;
			this.y=0;
		}
		else{
			this.x=0;
			this.y=0;
		}
	}
	
	public int X(){
		return this.x;
	}
	
	public int Y(){
		return this.y;
	}
}
