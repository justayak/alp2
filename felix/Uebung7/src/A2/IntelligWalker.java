package A2;

public class IntelligWalker extends Walker{
	int doneSteps;
	int[][] flaeche;
	
	public IntelligWalker(int size){
		super(size);
		this.doneSteps=0;
		ws=new boolean[size][size];
		this.flaeche=new int[size][size];
	}
	
	
	private boolean northFree(){
		return (y>0 && !ws[x][y-1]);
		
	}
	
	private boolean eastFree(){
		return x<ws.length-1 && !ws[x+1][y];
	}
	
	private boolean southFree(){
		return y<ws.length-1 && !ws[x][y+1];
	}
	
	private boolean westFree(){
		return x>0 && !ws[x-1][y];
	}
	
	public int randomInt(){   //testet, welche Flächen frei sind und bildet randomzahl für die flächen
		int d;
		if(northFree() && eastFree() && westFree() && southFree())
			return rand.nextInt(4);
		else if(northFree() && eastFree() && westFree())
			return rand.nextInt(3);
		else if(northFree() && eastFree() && southFree()){
			d = rand.nextInt(3);
			if(d==2)
				return 3;
			else
				return d;
		}
		else if(northFree() && southFree() && westFree()){
			d = rand.nextInt(3);
			if(d==1)
				return 3;
			else
				return d;
		}
		else if(eastFree() && southFree() && westFree()){
			d = rand.nextInt(3);
			if(d==0)
				return 3;
			else
				return d;
		}
		else if(northFree() && eastFree())
			return rand.nextInt(2);
		else if(northFree() && westFree()){
			d = rand.nextInt(2);
			if(d==1)
				return 2;
				else 
					return 0;
		}
		else if(northFree() && southFree()){
			d = rand.nextInt(2);
			if(d==1)
				return 3;
				else 
					return 0;
		}
		else if(eastFree() && westFree()){
			d = rand.nextInt(2);
			if(d==0)
				return 1;
				else 
					return 2;
		}
		else if(eastFree() && southFree()){
			d = rand.nextInt(2);
			if(d==0)
				return 1;
				else 
					return 3;
		}
		else if(westFree() && southFree()){
			d = rand.nextInt(2);
			if(d==0)
				return 2;
				else 
					return 3;
		}
		else if(northFree())
			return 0;
		else if(eastFree())
			return 1;
		else if(westFree())
			return 2;
		else 
			return 3;	
	}
	
	public void try_step(){
			int d = randomInt();
			switch (Direction.values()[d]){
			   case NORTH: ws[x][y-1]=true; 
			   				this.flaeche[x][--y]=this.doneSteps;
			   				break;
			   case EAST:  ws[x+1][y]=true;
			   				this.flaeche[++x][y]=this.doneSteps;
  							break;
			   case SOUTH: ws[x][y+1]=true;
  							this.flaeche[x][++y]=this.doneSteps;
			   				break;
			   case WEST:  ws[x-1][y]=true;
		   					this.flaeche[--x][y]=this.doneSteps;
			   				break;
			}
			this.doneSteps=this.doneSteps+1;
	}
	
	public int simulate_walks(int n){
		int sum=0;
		for(int i=0;i<n;i++){
			IntelligWalker walker= new IntelligWalker(20);
			walker.init_walk();			
			while(walker.can_move()){
				walker.try_step();
			}
			sum+=walker.doneSteps;
			walker = null;
		}		
		return sum/n;
	}
	public void wahrscheinlichkeit(){
		IntelligWalker walker = new IntelligWalker(20);
		int[]list=new int[walker.spaceSize*walker.spaceSize];
		int meiste=0;
		for(int i=1;i<=100000;i++){
			IntelligWalker walk = new IntelligWalker(20);
			walk.init_walk();
			while(walk.can_move()){
				walk.try_step();
			}
			list[walk.doneSteps]+=1;
			if(walk.doneSteps>meiste)
				meiste=walk.doneSteps;
			walk=null;
		}
		for(int i=0;i<=meiste;i++){
			System.out.println(i+"  : "+list[i]/100000.0);
		}
	}
	
}
