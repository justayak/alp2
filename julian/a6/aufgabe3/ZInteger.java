package a6.aufgabe3;

class ZInteger {

	public final int a;
	public final int b;
	
	public final int value;
	
	public ZInteger(int a, int b){
		if (a < 0 || b < 0) throw new RuntimeException("negativ..");
		this.a = a;
		this.b = b;
		this.value = b - a;
	}
	
	public void print(){
		System.out.println(" ( a: " + this.a + " | b: " + this.b + " --> v: " + this.value + "  ) ");
	}

    @Override
    public String toString(){
        return "(" + this.a + "," + this.b + ")";
    }
	
	public ZInteger add(ZInteger other){
		int b = this.a + other.a;
		int a = this.b + other.b;
		return new ZInteger(a,b);		
	}
	
	public ZInteger subtract(ZInteger other){
		int a = this.a + other.b;
		int b = this.b + other.a;
		return new ZInteger(a,b);
	}
	
	public ZInteger multiply(ZInteger other){
		int b = this.a * other.a + this.b * other.b;
		int a = this.a * other.b+ this.b * other.a;
		return new ZInteger(a,b);
	}

	public ZInteger simplify(){
		int a = -1;
		int b = -1;
		if( this.a > this.b){
			a = a - b;
			b = 0;
		}else{
			b = b -a;
			a = 0;		
		}
		return new ZInteger(a,b);		
	}

    /**
     * ==
     * @param other
     * @return
     */
	public boolean equals(ZInteger other){
        return this.value == other.value;
    }

    /**
     * >=
     * @param other
     * @return
     */
    public boolean greaterOrEqual(ZInteger other){
        return this.value >= other.value;
    }

    /**
     * <=
     * @param other
     * @return
     */
    public boolean lessOrEqual(ZInteger other){
         return this.value <= other.value;
    }

    /**
     * <
     * @param other
     * @return
     */
    public boolean less(ZInteger other){
        return this.value < other.value;
    }

    /**
     * >
     * @param other
     * @return
     */
    public boolean greater(ZInteger other){
        return this.value > other.value;
    }
}