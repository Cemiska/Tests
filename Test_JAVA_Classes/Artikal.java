package test;

//Artikal (Apstraktna klasa) poseduje naziv i cenu. Naziv i cena se postavljaju prilikom kreiranja, i mogu se i postaviti i
//dohvatiti.
//Artikal poseduje i abstraktnu metodu getTip koja je povratnog tipa String; 
//Artiklu se moze dohvatiti i cena sa odredjenim poslatim popustom u procentima. 
//Popust se izracunava prema formuli: cena*popust/100. 
//Artikal se moze ispisati u formatu: {TipArtikla} - {Naziv} - {Cena}

public abstract class Artikal {

	private String naziv;
	private double cena;
	
	public Artikal(String naziv, double cena) {
		super();
		this.naziv = naziv;
		this.cena = cena;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}
	
	//Artikal poseduje i abstraktnu metodu getTip koja je povratnog tipa String; 
	
	public abstract String getTip();
	
	//Artiklu se moze dohvatiti i cena sa odredjenim poslatim popustom u procentima.
	//Popust se izracunava prema formuli: cena*popust/100. 
	
	public void popust(double popust) {
		
		cena = cena - cena * popust/100;
		
	}

	//Artikal se moze ispisati u formatu: {TipArtikla} - {Naziv} - {Cena}
	
	@Override
	public String toString() {
		return getTip() + " - " + this.naziv + " - " + this.cena;
	}


	
	
	
	
}
