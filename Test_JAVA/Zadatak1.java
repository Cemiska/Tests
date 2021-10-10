import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napisati program koji racuna prosecnu visinu kosarkaskog tima. Korisnik na
		 * standardni ulaz unosi visinu svih pet igraca kosarkskog tima. Visina je
		 * izrazena u metrima. Po zavrsetku unosa ispisuje se prosecna visina clana
		 * ekipe, visina najviseg igraca, visina najnizeg igraca.
		 */

		Scanner s = new Scanner(System.in);

		int i = 0;
		double hMax = 0;
		double hMin = 0;
		double h = 0;
		double prosek = 0;

		for (i = 0; i < 5; i++) {

			System.out.println("Unesite svoju visinu u m");
			h = s.nextDouble();

			if (h > hMax) {
				hMax = h;

			}
			if (h < hMin) {

				hMin = h;

			}
			
		}

		System.out.println("Visina najviseg igrača je: " + hMax);
		System.out.println("Visina javiseg igrača je: " + hMin);

		prosek = (5 * h) / 5;
		System.out.println("Prosečna visina svih 5 igrača je: " + prosek);

		
	}
}
