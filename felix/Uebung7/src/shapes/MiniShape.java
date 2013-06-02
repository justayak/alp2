package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MiniShape implements Shape,Animation{
	   double radius;
	   Point center;
	   
	   Color color;
	   ShapesWorld welt;
	   double velocityX = 2;
	   double velocityY = 2;
	
	
	public MiniShape(){
		this.radius=10;
		this.color=Color.red;
		this.center = new Point();
		Random rand = new Random();
		int z= rand.nextInt(2);
		if(z==0)
			velocityX=rand.nextDouble()*5;
		else
			velocityX=rand.nextDouble()*-5;			
		z= rand.nextInt(2);
		if(z==0)
			velocityY=rand.nextDouble()*5;
		else
			velocityY=rand.nextDouble()*-5;
	}
	@Override
	public void play() {
	    if ( (center.x+radius)<=welt.getMax_X() && (center.x-radius)>=welt.getMin_X() )
	    	center.x = center.x + velocityX;
	    else{
	    	this.velocityX *=-1;
 		center.x = center.x + velocityX;
	    }
	    if ( (center.y+radius)<=welt.getMax_Y() && (center.y-radius)>=welt.getMin_Y() )
	    	center.y = center.y + velocityY;
	    else{
	    	this.velocityY *=-1;
 		center.y = center.y + velocityY;
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
		welt.addShape(new MiniShape());
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
