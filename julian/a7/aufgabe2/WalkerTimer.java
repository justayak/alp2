package a7.aufgabe2;

/**
 * @author  Prof. Dr. Margarita Esponda  
 * @version 0.1
 */
public class WalkerTimer extends Thread {
	
	   public final static int ONE_STEP = 200;
	   WalkerPanel randomWalkerFrame;

	   public WalkerTimer( WalkerPanel rwf ) {
	      randomWalkerFrame = rwf;
	   }

	   public void run() {
		  
	      while ( randomWalkerFrame.walker.can_move() ) {
	         try { 
	        	 Thread.sleep(ONE_STEP);
	         } catch ( InterruptedException ie ) {}
	         randomWalkerFrame.walker.try_step();
	         randomWalkerFrame.repaint();
	      }
	   } // end of run
}
