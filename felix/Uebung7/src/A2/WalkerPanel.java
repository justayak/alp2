package A2;
/**
 * @author  Prof. Dr. Margarita Esponda  
 * @version 0.1
 */
import javax.swing.*;
import java.awt.*;

public class WalkerPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	IntelligWalker walker;
	public int rectSize = 24;
	public Font font = new Font("Verdana",Font.PLAIN,10);

	public WalkerPanel(int size){
		this.walker = new IntelligWalker(size);
		this.walker.clean_space();
		this.walker.init_walk();
	}

	public void paintComponent( Graphics g){
		for( int i=0; i<walker.ws.length; i++ ){
			for( int j=0; j<walker.ws.length; j++ ){
				if ( !walker.ws[i][j] ){
					g.setColor(Color.BLUE);
					g.fillRect(i*rectSize,j*rectSize,rectSize,rectSize);				
				}
				else{				
					g.setColor(Color.LIGHT_GRAY);
					g.fillRect(i*rectSize,j*rectSize,rectSize,rectSize);
					g.setColor(Color.red);
					String z = String.valueOf(walker.flaeche[i][j]);
					g.drawString(z, i*rectSize, j*rectSize+rectSize);
				}	
				g.setColor(Color.RED);
				g.drawRect(i*rectSize,j*rectSize,rectSize,rectSize);
				g.setColor(Color.WHITE);

			}
		}
	} // end of class WalkerPanel

}// end of class RandomWalkerFrame
