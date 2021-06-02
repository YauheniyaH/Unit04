package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Task02 {

	public static void main(String[] args) {

		double[] ar;
		int n;
		double min;
		double max;
		double len;

		Random rand = new Random();

		Scanner sr = new Scanner(System.in);
		System.out.println("Введите n>");
		n = sr.nextInt();

		ar = new double[n];

		for (int i = 0; i < n; i++) {
			ar[i] = rand.nextDouble();
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.printf("[%4.2f]", ar[i]);
		}
		System.out.println();

		min = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] < min) {
				min = ar[i];
			}
		}
		
		max=ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		
		len=Math.abs(max-min);
		System.out.printf("min= [%4.2f]",min);
		System.out.printf("max= [%4.2f]",max);
		System.out.printf("len= [%4.2f]",len);
	}

}
