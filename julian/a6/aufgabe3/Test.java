package a6.aufgabe3;

class Test {
	
	public static void main(String [] args){
		ZInteger a = new ZInteger(8,5);
		
		ZInteger b = new ZInteger(1,4);
		
		ZInteger c = a.multiply(b);
		ZInteger d = b.multiply(a);
		
		a.print();
		b.print();
		c.print();
		d.print();
		
		System.out.println("ende");
	}
	
}