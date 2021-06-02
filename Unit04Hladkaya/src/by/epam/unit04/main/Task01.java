package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		int[] ar ;
		int [] ar_res;
		int n;
		int m=0;
		Random rand = new Random();
		
		Scanner sr =new Scanner (System.in);
		System.out.println("Введите n");
		n=sr.nextInt();
		
		ar=new int[n];
		
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(1000);
		}

		for (int i=0; i<ar.length; i++){
			System.out.print("ar[" + i + "]=" + ar[i] + "; ");
			}
		System.out.println();
		
		for (int i=0;i<ar.length;i++) {
			if (ar[i]%2==0) {
				m=m+1;
			}
		}
		ar_res=new int[m];
		int j=0;
		for (int i=0;i<ar.length;i++) {
			if (ar[i]%2==0) {
				ar_res[j]=ar[i];
				j=j+1;
			}
		}
		
		
		for (int i=0; i<m; i++){
			System.out.print("ar_res[" + i + "]=" + ar_res[i] + "; ");
			}
		System.out.println();

	}

}
