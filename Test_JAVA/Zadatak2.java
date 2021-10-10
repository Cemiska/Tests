import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napraviti program za logovanje. U programu prethodno definisati proizvoljno
		 * username i password vrednost. Potrebno omoguciti da korisnik unese svoj
		 * username i password. Ispitati username i password i u slucaju neslaganja sa
		 * predefinisanim vrednostima ispisati da li je greska na passwordu ili na
		 * usernamu. Takodje omoguciti da korisnika nakon 3 pogresna unosa vise ne moze
		 * unositi i da dobija obavestenje da je blokiran.
		 * 
		 */

		Scanner s = new Scanner(System.in);

		String imeMoje = "Milica";
		String šifraMoja = "123456m";

		int i = 0;

		while (i < 3) {

			i++;

			System.out.println("Unesite username. Dužina ne sme biti veća od 6 i mora sadržati veliko slovo.");
			String ime = s.next();

			System.out.println("Unesite password. Dužina ne sme biti veća od 8 i mora sadržati bar jedno slovo. ");
			String šifra = s.next();

			if (ime.equals(imeMoje) && šifra.equals(šifraMoja)) {

				System.out.println("Unos je ispravan.");
				break;
			
			} else if (!ime.equals(imeMoje) || šifra.equals(šifraMoja)) {

				System.out.println("Username je neispravan.");

			} else if (ime.equals(imeMoje) || !šifra.equals(šifraMoja)) {

				System.out.println("Password je neispravan.");
			} else if (!ime.equals(imeMoje) || !šifra.equals(šifraMoja)) {

					System.out.println("Oba unosa su neispravna.");
				
			} 
			
			}
		System.out.println("Tri pogrešna unosa.");
		
		}
		
	}

