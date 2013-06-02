package A2;

import java.util.Random;

public class Party {
	
	public int gossip(int anzahl){
		Random rand = new Random();
		Person list[] = new Person[anzahl];
		int opfer=rand.nextInt(anzahl-1);
		int erzähler = rand.nextInt(anzahl-1);
		while(opfer==erzähler){
			erzähler=rand.nextInt(anzahl-1);
		}
		for(int i=0;i<anzahl;i++){
			list[i]=new Person();
			if(i==opfer){
				list[i].setOpfer(true);
			}
			if(i==erzähler){
				list[i].setErzaehler(true);
			}
		}
		int vorgaenger=erzähler;
		while(true){
			erzähler = rand.nextInt(anzahl-1);
			if(list[erzähler].getOpfer() || erzähler == vorgaenger)
				continue;
			else if(list[erzähler].getErzaehler())
				break;
			else{
				list[erzähler].setErfahren(true);
				vorgaenger = erzähler;
		}
	}
		int zähler=0;
		for(int i=0;i<anzahl;i++){
			if(list[i].getErfahren()){
				zähler++;
			}
			//System.out.print("("+list[i].getOpfer()+", "+list[i].getErzaehler()+", "+list[i].getErfahren()+")"+", ");
		}
		//System.out.println();
		//System.out.println(zähler);
		return zähler;
	}
	
	public void durchschnitt(int anzahl){
		int summe=0;
		for(int i=1;i<=100000;i++){
			summe += gossip(anzahl);
		}
		System.out.println("Durchschnitt bei einer Anzahl von "+anzahl+"Personen: "+summe/100000);
	}
	
	public void wahrscheinlichkeit(int anzahl){
		int zählen=0;
		for(int i=0;i<100000;i++){
			if(gossip(anzahl)>=anzahl-2){
				zählen++;
			}
		}
		if(zählen>0){
			float ergebnis=1/(zählen/100000);
			System.out.println(ergebnis);
		}
		else
			System.out.println(0);
	}
}
