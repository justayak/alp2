package src;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//aufg1();
		aufg3();
	}
	static void aufg3(){
		ZInteger a1= new ZInteger(3,4);
		ZInteger a2= new ZInteger(7,7);
		System.out.println(a1+" "+a2);
		ZInteger ergebnis = a1.mul(a2);
		System.out.println(ergebnis);
		System.out.println(a1.greaterEqual(a2));
	}
	static void aufg1(){
		int size = (int)(Math.random()*(50-1)+1);
		int [][]matrix=new int[size][size];
		String ergebnis="";
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				matrix[i][j]=(int) (int)(Math.random()*(2 - 0) + 0);
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		Aufgabe1 a = new Aufgabe1();
		ergebnis=a.find_square(matrix, size,size);
		System.out.println(ergebnis);
	}
	

}
