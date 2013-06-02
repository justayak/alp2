package A2;

/**
 * @author  Prof. Dr. Margarita Esponda  
 * @version 0.1
 */
import javax.swing.JFrame;

public class WalkerWindow  extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public WalkerWindow(){
	     
	     WalkerPanel rwf = new WalkerPanel(20);
	     this.setLocation(300,200);
	     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     
	     this.add( rwf );	
	     int size = rwf.rectSize*(rwf.walker.spaceSize+1);
	     this.setSize(size,size);
	     
	     WalkerTimer wt = new WalkerTimer(rwf);  
	     this.setVisible(true);
	     wt.start();
	}
	
	
    public static void main( String args[] )
    {    
	     new WalkerWindow();
	     IntelligWalker walk = new IntelligWalker(20);
	     walk.wahrscheinlichkeit();
	}

}
