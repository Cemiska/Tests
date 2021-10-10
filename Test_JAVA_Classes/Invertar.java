package test;

import java.util.ArrayList;

////Invertar ima naziv koji se zadaje prilikom kreiranja i moze se samo dohvatiti. 
//Invertar sadrzi listu artikala, lista se inicijalizuje prazna. 
//I artikle je moguce dodavati jedan po jedan nakdandno. 
//Artikal se ne moze dodati ukoliko vec postoji u listi. 
//Lista artikala moze samo da se dohvati. 
//Moguce je ispisati invertar u formatu:
////{Naziv Invertara}
////{Artikal 1}
////{Artikal 2}
////.
////..
//...
//Odnosno, ispisuje se naziv invertara a zatim redom artikli, svaki u zasebnom redu.

public class Invertar {

	private String naziv;
	private ArrayList<Artikal> artikli;
	
	public Invertar(String naziv, ArrayList<Artikal> artikli) {
		super();
		this.naziv = naziv;
		this.artikli = artikli;
	}

	//naziv moze samo da se dohvati 
	public String getNaziv() {
		return naziv;
	}

	//Lista artikala moze samo da se dohvati.
	public ArrayList<Artikal> getArtikli() {
		return artikli;
	}
	
	//I artikle je moguce dodavati jedan po jedan nakdandno.
	//Artikal se ne moze dodati ukoliko vec postoji u listi. 
	
	public String dodajArtikal() {
		
		

		if(artikli.contains(artikli)) {
			System.out.println("Artikal već postoji u listi");
		} 
		return dodajArtikal();
	} 

	
	//Moguce je ispisati invertar u formatu:
		////{Naziv Invertara}
		////{Artikal 1}
		////{Artikal 2}
		////.
		////..
		//...
		//Odnosno, ispisuje se naziv invertara a zatim redom artikli, svaki u zasebnom redu.
		
	@Override
	public String toString() {
	
		StringBuilder sb = new StringBuilder();
		sb.append(this.naziv);
		sb.append("\n");
		sb.append(this.artikli);
		return sb.toString();
	}
	
	

	
	
}
