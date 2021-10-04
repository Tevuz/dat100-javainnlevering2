package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			
			if (i == tabell.length-1) {
				System.out.println(tabell[i]);
			} else {
				System.out.print(tabell[i] + ", ");
			}
		
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String streng = "[";
		
		for (int i = 0; i < tabell.length; i++) {
			if (i==tabell.length-1) {
				streng = streng + tabell[i];
			} else {
				streng = streng + tabell[i] + ",";
			}
			
			
		}
		
		streng = streng + "]";
		
		return streng;
		
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum = sum + tabell[i];
		}
		
		return sum;
		
		/*int sum = 0;

		int i = 0;
		while (i < tabell.length) {
			sum = sum + tabell[i];
			i++;
		}
		
		return sum; 
		
		int sum = 0;
		
		for (int i : tabell) {
			sum = sum + i;
		}
		
		return sum; */
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean finnesTall = false;
		
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				finnesTall = true;
			}
		}
		
		return finnesTall;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int posisjon = -1;
		
		for  (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				posisjon = i;
			}
		}
		
		return posisjon;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int pos = 0;
		int[] revers = new int[tabell.length];
		
		for (int i = tabell.length-1; i >= 0; i--) {
			
			revers[pos] = tabell[i];
			
			pos++;
		}
		
		return revers;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		// Avgjøre om tabellen av heltall er sortert i stigende rekkefølge
		boolean sortert = true;
		for (int i = 0; i < tabell.length-1; i++) {
			
			if (tabell[i] > tabell[i+1]) {
				sortert = false;
			}
			
		}
		return sortert;
		
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] sammensatt = new int[tabell1.length+tabell2.length];
		
		for (int i = 0; i < tabell1.length; i++) {
			sammensatt[i] = tabell1[i];
		}
		
		for (int i = tabell1.length; i < tabell1.length+tabell2.length; i++) {
			sammensatt[i] = tabell2[i-tabell1.length];
		}
		
		return sammensatt;
	}
}
