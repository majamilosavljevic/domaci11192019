package domaci_11192019;

import java.util.Scanner;

public class Zadatak2_11192019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce na standardnom izlazu ispisati proizvod elemenata
		 * niza koji su veci od svog indeksa (preko konzole uneti duzinu i clanove niza)
		 */

		Scanner scan = new Scanner(System.in);
		int[] array;
		int n = 0;

		while (n <= 1) {
			System.out.println("Unesite duzinu niza (min 2): ");
			n = scan.nextInt();
		}
		array = new int[n];
		int x = 1;
		int result = 1;

		for (int i = 0; i < n; i++) {
			System.out.println("Unesite " + x + ". broj: ");
			array[i] = scan.nextInt();

			if (array[i] > i) {
				result *= array[i];
			}
			x++;
		}
		System.out.println("Proizvod elemenata niza vecih od svog indexa je: " + result);
	}

}
