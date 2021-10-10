package test;

import java.util.ArrayList;

//Napisati Main metodu u klasi InvertarTest koja prikazuje rad prethodnih klasa.

public class GlavnaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Artikal> lista = new ArrayList();
		
		Uredjaj u1 = new Uredjaj("Mikser", 5000, "Bosch");
		u1.getCena();
		u1.getTip();			//Metoda getTip za uredjaj vraca vrednost: Uredjaj. 
		System.out.println(u1);
	
		Uredjaj u2 = new Uredjaj("Masina za ves", 160000, "Miele");
		System.out.println(u2);
		
		Grickalica g1 = new Grickalica("Cips", 80, "Clipsy");
		g1.getTip();				//Metoda getTip za uredjaj vraca vrednost: Grickalica. 
		System.out.println(g1);
		
		Grickalica g2 = new Grickalica("Smoki", 75, "SokoStark");
		g2.popust(50);			// uracunat popust 50%
		System.out.println(g2);
	
		
		lista.add(g1);
		lista.add(g2);
		lista.add(u1);
		lista.add(u2);
		
		
		for(int i = 0; i <lista.size(); i++) {
			System.out.println(i+1 + ". artikal je: " + lista.get(i).getNaziv());
		}
		
		
	}

}
