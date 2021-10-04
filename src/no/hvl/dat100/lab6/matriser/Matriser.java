package no.hvl.dat100.lab6.matriser;

import no.hvl.dat100.lab5.tabeller.Tabeller;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] rad: matrise) {
			for (int plass: rad) {
				System.out.print(plass + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String matriseString = "";
		
		for (int[] rad: matrise) {
			for (int plass: rad) {
				if (plass%rad.length==0) {
					matriseString += plass + " \n";
				} else {
					matriseString += plass + " ";
				}
				
			}
			
		}
		return matriseString;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] skalert = matrise;
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				int nyttTall = matrise[i][j]*tall;
				skalert[i][j] = nyttTall;
			}
		}
		return skalert;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean erLik = false;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j]==b[i][j]) {
					erLik = true;
				} else {
					erLik = false;
				}
			}
		}
		return erLik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		
	}
	

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int[][] multiplisert = new int[a.length][a[0].length];
		int pos = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				multiplisert[i][j] = 0;
				for(int k = 0; k < a.length; k++) {
					multiplisert[i][j] += a[i][k]*b[k][j];
				}
			}
		}
		
		return multiplisert;
	
	}
}
