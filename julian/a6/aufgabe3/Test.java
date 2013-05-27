package a6.aufgabe3;

class Test {
	
	public static void main(String [] args){


        ZInteger a = new ZInteger(8,5);
		ZInteger b = new ZInteger(7,12);
		
		ZInteger c = a.add(b);
		ZInteger d = b.subtract(a);
        ZInteger e = b.multiply(a);

        System.out.println(a.value + " + " + b.value + " = " + c.value + " (add)");
        System.out.println(a.value + " - " + b.value + " = " + d.value + " (subtract)");
        System.out.println(a.value + " * " + b.value + " = " + e.value + " (multiply)");


        ZInteger f = new ZInteger(5,15);
        ZInteger g = new ZInteger(2,12);

        System.out.println(f.value + " >= " + g.value + " = " + f.greaterOrEqual(g) + " (>=)");
        System.out.println(f.value + " > " + g.value + " = " + f.greater(g) + " (>=)");

        System.out.println(f);

		System.out.println("done");
	}
	
}