package test;

//Grickalica je Artikal koji pored naziva i cene ima i naziv brenda. Naziv brenda se postavlja prilikom kreiranja, moze se samo
//dohvatiti. 
//Metoda getTip za uredjaj vraca vrednost: Grickalica. 
//Uredjaj se moze ispisati u formatu: 
//{TipArtikla} - {Naziv} -{Cena} - {Brend}

public class Grickalica extends Artikal {

	private String brend;

	public Grickalica(String naziv, double cena, String brend) {
		super(naziv, cena);
		this.brend = brend;
	}

	public String getBrend() {
		return brend;
	}
	
	
	public String getTip() {
		return "grickalica";
	}
	
	
	@Override
	public String toString() {
		
		return this.getTip() + " - " + super.getNaziv() + " - " + super.getCena() + " - " + this.brend; 
	}

	
	
}
