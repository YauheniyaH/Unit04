package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		int[] ar;
		int n;
		int temp;
		

		Scanner sr = new Scanner(System.in);
		System.out.println("Введите n>");
		n = sr.nextInt();

		ar = new int[n];

		Random rand = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(1000);
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%4d ", ar[i]);
		}
		System.out.println();

		for (int j = 0; j < ar.length; j++) {
			temp = ar[j];
			 int i=j-1;
			for ( i = j - 1; i >= 0; i--) {
				if (temp < ar[i]) {
					ar[i + 1] = ar[i];
				} else {
					break;
				}
				

			}
			ar[i + 1] = temp;

		}

		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%4d ", ar[i]);
		}
		System.out.println();

	}

}
