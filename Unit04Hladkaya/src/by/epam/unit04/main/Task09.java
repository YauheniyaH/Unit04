package by.epam.unit04.main;

public class Task09 {

	public static void main(String[] args) {
		int n =8;
		 int [][] mas = new int[n][n];
		 
		 for (int i=0; i<n ; i++) {
			 mas[i][n-i-1]=i+1;
		 }
		 
			for(int i=0; i<mas.length; i++) {
				for(int j=0; j<mas[i].length; j++) {
				System.out.printf("%4d", mas[i][j]);
				}
				System.out.println();
			}

	}

}
