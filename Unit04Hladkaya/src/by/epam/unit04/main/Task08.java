package by.epam.unit04.main;

import java.util.Random;

public class Task08 {

	public static void main(String[] args) {
		int n=5;
		int m=7;
		int[][] mas= new int [n][m];
		int k=2;
		int p=4;
	
		
		Random rand = new Random();
		
		for (int i=0;i<mas.length;i++) {
			for (int j =0; j<mas[i].length;j++) {
				mas[i][j]=rand.nextInt(12);
			}
		}
		
		for(int i=0; i<mas.length; i++) {
			for(int j=0; j<mas[i].length; j++) {
			System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(k+" -я строка");
		for(int i=0; i<mas[k-1].length; i++) {
			System.out.printf("%4d", mas[k-1][i]);
		}
		System.out.println();
		
		System.out.println(p+" -й столбец");
		for(int i=0; i<mas.length; i++) {
			System.out.println( mas[i][p-1]);
		}
		

	}

}
