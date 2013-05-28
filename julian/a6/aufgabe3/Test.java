package a6.aufgabe3;

class Test {
	
	public static void main(String [] args){



        ZInteger p1 = new ZInteger(5,7);
        ZInteger p2 = new ZInteger(3,7);

        ZInteger n1 = new ZInteger(12, 4);
        ZInteger n2 = new ZInteger(4, 3);



        System.out.println(p1.value + " + " + p2.value + " = " + p1.add(p2).value + " (add)");
        System.out.println(p1.value + " + " + n2.value + " = " + p1.add(n2).value + " (add)");
        System.out.println(n1.value + " + " + n2.value + " = " + n1.add(n2).value + " (add)");

        System.out.println(p1.value + " - " + p2.value + " = " + p1.subtract(p2).value + " (subtract)");
        System.out.println(p1.value + " - " + n2.value + " = " + p1.subtract(n2).value + " (subtract)");
        System.out.println(n1.value + " - " + n2.value + " = " + n1.subtract(n2).value + " (subtract)");

        System.out.println(p1.value + " * " + p2.value + " = " + p1.multiply(p2).value + " (multiply)");
        System.out.println(p1.value + " * " + n1.value + " = " + p1.multiply(n1).value + " (multiply)");
        System.out.println(n1.value + " * " + n2.value + " = " + n1.multiply(n2).value + " (multiply)");




        ZInteger f = new ZInteger(5,15);
        ZInteger g = new ZInteger(2,12);

        System.out.println(f.value + " >= " + g.value + " = " + f.greaterOrEqual(g) + " (>=)");
        System.out.println(f.value + " > " + g.value + " = " + f.greater(g) + " (>=)");

        System.out.println(f);

        System.out.println("simplify: " + new ZInteger(83,44).simplify());

		System.out.println("done");


	}
	
}