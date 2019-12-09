package domaci_11192019;

import java.util.Scanner;

public class ZadatakSaCasa {

	public static void main(String[] args) {
		/*
		 * niz celih brojeva, ucitati elemente, za svaki element proveriti da li je
		 * palindrom i ispisati "jeste palindrom" ili "nije palindrom"
		 */
		Scanner scan = new Scanner(System.in);
		int[] array;
		int x = 1;
		int n = 0;

		while (n <= 1) {
			System.out.println("Unesite duzinu niza (min 2):");
			n = scan.nextInt();
		}
		array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite " + x + ". broj u niz:");
			array[i] = scan.nextInt();
			x++;
		}
		for (int i = 0; i < n; i++) {
			int newDig = 0;
			int digTemp = array[i];

			while (digTemp != 0) {
				int dig1 = digTemp % 10;
				digTemp = digTemp / 10;
				newDig = (newDig * 10) + dig1;
			}
			if (newDig == array[i])
				System.out.println("Broj " + newDig + " je palindrom");
			else
				System.out.println("Broj " + newDig + " nije palindrom");
		}
	}
}
