package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.println(tilStreng(tabell));
	}

	// b)
	public static String tilStreng(int[] tabell) {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		if (tabell.length > 0)
			builder.append(tabell[0]);
		for (int i = 1; i < tabell.length; i++) {
			builder.append(",");
			builder.append(tabell[i]);
		}
		builder.append("]");
		return builder.toString();
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i : tabell)
			sum += i;
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int i : tabell) {
			if (i == tall)
				return true;
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall)
				return i;
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		tabell = tabell.clone();
		for (int i = 0; i < (tabell.length - 1) / 2; i++) {
			int t = tabell[i];
			tabell[i] = tabell[tabell.length - i - 1];
			tabell[tabell.length - i - 1] = t;
		}
		return tabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		if (tabell.length <= 1)
			return true;
		for (int i = 1; i < tabell.length; i++) {
			if (tabell[i] < tabell[i - 1])
				return false;
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] resultat = new int[tabell1.length + tabell2.length];
		int i = 0;

		for (int j = 0; j < tabell1.length; j++)
			resultat[i++] = tabell1[j];

		for (int j = 0; j < tabell2.length; j++)
			resultat[i++] = tabell2[j];
		
		return resultat;
	}
}
