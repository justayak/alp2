

public class StdDrawExample {
	
	public static void nikolaus(){
		
		//setzt den Bereich von x und y auf (0,7)
		StdDraw.setXscale(0,7);
		StdDraw.setYscale(0,7);
		
		//zeichnet das Haus vom Nikolaus mit Seitenlänge 5
		StdDraw.line(0,0,5,5);
		StdDraw.line(5,5,0,5);
		StdDraw.line(0,5,5,0);
		StdDraw.line(5,0,0,0);
		StdDraw.line(0, 0,0, 5);
		
		StdDraw.line(0, 5, 2.5, Math.sqrt(50));
		 StdDraw.line(2.5, Math.sqrt(50),5,5);
		 StdDraw.line(5,5,5,0);
	
	
	}
	
	public static void main(String[] args) {
		nikolaus();
	}
}
