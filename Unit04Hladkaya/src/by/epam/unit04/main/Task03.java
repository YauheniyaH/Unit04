package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;


public class Task03 {

	public static void main(String[] args) {
		int[] ar;
		int n;
		int positive=0, negative=0, zeroAmount=0;
		
		Random rand = new Random();

		Scanner sr = new Scanner(System.in);
		System.out.println("Введите n>");
		n = sr.nextInt();

		ar = new int[n];

		for (int i = 0; i < n; i++) {
			ar[i] = rand.nextInt(1000)-500;
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.println( ar[i]);
		}
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i]>0) {
				positive=positive+1;
			}else {
				if(ar[i]==0) {
					zeroAmount=zeroAmount+1;
				}else {
					negative=negative+1;
				}
			}
		}
		
		System.out.println("Количество положительных "+positive);
		System.out.println("Количество отрицательных "+negative);
		System.out.println("Количество нулевых "+zeroAmount);

	}

}
