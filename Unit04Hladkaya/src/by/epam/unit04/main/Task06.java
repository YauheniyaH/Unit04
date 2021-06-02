package by.epam.unit04.main;

import java.util.Random;

public class Task06 {

	public static void main(String[] args) {
		//Дан двухмерный массив n×m элементов.
		//Определить, сколько раз встречается число 7 среди элементов массива.
		int n=5;
		int m=7;
		int[][] mas= new int [n][m];
		int count=0;
		
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
		
		for (int i=0;i<mas.length;i++) {
			for (int j =0; j<mas[i].length;j++) {
				if(mas[i][j]==7) {
					count=count+1;
				}
			}
		}
		
		
			System.out.println("В массиве "+n+"x"+m+" найдено "+count+" числa 7 ");
		

	}

}
