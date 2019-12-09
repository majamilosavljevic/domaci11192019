package domaci_11192019;

import java.util.Scanner;

public class Zadatak1_11192019 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce na standarnom izlazu ispisati poruku “Niz je
		 * palindrom” ili “Niz nije palindrom” (u zavisnosti da li niz jeste ili nije
		 * palindrom)
		 */
		Scanner scan = new Scanner(System.in);
		int[] array;
		int[] arrayBack;
		int x = 1;
		int n = 0;
		int i = 0;

		while (n <= 1) {
			System.out.println("Unesite duzinu niza (min 2):");
			n = scan.nextInt();
		}
		array = new int[n];
		arrayBack = new int[n];

		for (i = 0; i < n; i++) {
			System.out.println("Unesite " + x + ". broj u niz:");
			array[i] = scan.nextInt();
			x++;
		}
		System.out.print("Elementi niza su: ");
		for (i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.print("Elementi niza unazad su: ");

		x = 1;
		for (i = 0; i < n; i++) {
			arrayBack[i] = array[n - x];
			System.out.print(arrayBack[i] + " ");
			x++;
		}
		System.out.println();
		boolean isPalindrom = true;
		for (i = 0; i < n; i++) {
			if (array[i] != arrayBack[i]) {
				isPalindrom = false;
				System.out.println("Niz nije palindrom");
				break;
			}
		}
		if (isPalindrom) {
			System.out.println("Niz je palindrom");
		}
	}
}
