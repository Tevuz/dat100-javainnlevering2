package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		System.out.println(tilStreng(matrise));
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[0].length; j++) {
				builder.append(matrise[i][j]);
				builder.append(" ");
			}
			builder.append("\n");
		}
		return builder.toString();

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] resultat = new int[matrise.length][];
		for (int i = 0; i < matrise.length; i++) {
			resultat[i] = new int[matrise[i].length];
			for (int j = 0; j < matrise[i].length; j++) {
				resultat[i][j] = matrise[i][j] * tall;
			}
		}
		return resultat;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if (a.length != b.length)
			return false;
		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length)
				return false;
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] != b[i][j])
					return false;
			}
		}
		return true;
	}

	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] resultat = new int[matrise[0].length][matrise.length];
		for (int i = 0; i < matrise.length; i++) {
			resultat[i][i] = matrise[i][i];
			for (int j = i + 1; j < matrise.length; j++) {
				resultat[i][j] = matrise[j][i];
				resultat[j][i] = matrise[i][j];
			}
		}
		return resultat;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		if (a.length != b[0].length || a[0].length != b.length)
			return null;
		int[][] resultat = new int[a.length][b.length];
		for (int i = 0; i < resultat.length; i++) {
			for (int j = 0; j < resultat.length; j++) {
				for (int k = 0; k < resultat[i].length; k++) {
					resultat[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return resultat;
	}
}
