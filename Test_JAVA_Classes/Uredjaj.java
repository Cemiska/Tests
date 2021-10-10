package test;

//Uredjaj je Artikal koji pored naziva i cene ima i naziv modela. Naziv modela se postavlja prilikom kreiranja, moze se samo
//dohvatiti. Metoda getTip za uredjaj vraca vrednost: Uredjaj. 
//Uredjaj se moze ispisati u formatu:
//{TipArtikla} - {Naziv} - {Cena} - {Model}

public class Uredjaj extends Artikal{

	private String model;

	public Uredjaj(String naziv, double cena, String model) {
		super(naziv, cena);
		this.model = model;
	}

	public String getModel() {
		return model;
	}
	
//	Metoda getTip za uredjaj vraca vrednost: Uredjaj. 
	public String getTip() {
		return "uredjaj";
	}
	
	//Uredjaj se moze ispisati u formatu:
	//{TipArtikla} - {Naziv} - {Cena} - {Model}
	@Override
	public String toString() {
		
		return this.getTip() + " - " + super.getNaziv() + " - " + super.getCena() + " - " + this.model;
	}

	
	
	
}
