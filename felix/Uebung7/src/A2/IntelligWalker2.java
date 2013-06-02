package A2;

public class IntelligWalker2 extends IntelligWalker{
	private IntelligWalker2[] walkers;
	
	public IntelligWalker2(int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}
	public void addWalker(IntelligWalker2[] walkers){
		this.walkers=walkers;
	}
	
	private boolean northFree(){
		boolean free=false;
		for(int i=0;i<walkers.length;i++){
			free = free && walkers[i].ws[x][y-1];
		}
		return (y>0 && !free);
		
	}
	
	private boolean eastFree(){
		boolean free=false;
		for(int i=0;i<walkers.length;i++){
			free = free && walkers[i].ws[x+1][y];
		}
		return x<ws.length-1 && !free;
	}
	
	private boolean southFree(){
		boolean free=false;
		for(int i=0;i<walkers.length;i++){
			free = free && walkers[i].ws[x][y+1];
		}
		return y<ws.length-1 && !free;
	}
	
	private boolean westFree(){
		boolean free=false;
		for(int i=0;i<walkers.length;i++){
			free = free && walkers[i].ws[x-1][y];
		}
		return x>0 && !free;
	}
	
	public void init_walk(){
		x = rand.nextInt(ws.length);
		y = rand.nextInt(ws.length);
	}
}
