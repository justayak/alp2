package a7.aufgabe3;

import java.awt.Color;
import java.awt.Graphics;

public class GoandBack implements Shape,Animation{
	   double radius;
	   Point center;
	   
	   Color color;
	   ShapesWorld welt;
	   double velocity = 2;
	
	
	public GoandBack(){
		this.radius=10;
		this.color=Color.magenta;
		this.center = new Point();
		
	}
	@Override
	public void play() {
	    if ( (center.x+radius)<=welt.getMax_X() && (center.x-radius)>=welt.getMin_X() )
	    	center.x = center.x + velocity;
	    else{
	    	this.velocity *=-1;
    		center.x = center.x + velocity;
	    }
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(this.color);
		g.fillOval((int)(center.x-this.radius), (int)(this.center.y-this.radius), (int)radius*2, (int)radius*2);
	}

	@Override
	public boolean contains(double x, double y) {
		if (x<(center.x-radius) || x>center.x+radius || y<(center.y-radius) || y>(center.y+radius))
		    return false;
		else
			return true;
	}

	@Override
	public double getRadius() {
		// TODO Auto-generated method stub
		return radius;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public Point getCenter() {
		// TODO Auto-generated method stub
		return center;
	}

	@Override
	public void setShapesWorld(ShapesWorld theWorld) {
		// TODO Auto-generated method stub
		this.welt=theWorld;
	}

	@Override
	public void userClicked(double at_X, double at_Y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void userTyped(char key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveTo(double x, double y) {
		this.center.x=x;
		this.center.y=y;
	}

}
