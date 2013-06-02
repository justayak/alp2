package A2;

public class Person {
	private boolean opfer;
	private boolean erzaehler;
	private boolean erfahren;
	
	public boolean getOpfer() {
		return opfer;
	}

	public void setOpfer(boolean opfer) {
		this.opfer = opfer;
	}

	public boolean getErzaehler() {
		return erzaehler;
	}

	public void setErzaehler(boolean erzaehler) {
		this.erzaehler = erzaehler;
	}

	public boolean getErfahren() {
		return erfahren;
	}

	public void setErfahren(boolean erfahren) {
		this.erfahren = erfahren;
	}

	public Person(){
		this.opfer=false;
		this.erzaehler=false;
		this.erfahren=false;
	}
}
