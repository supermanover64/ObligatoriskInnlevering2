package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		//throw new UnsupportedOperationException("Metoden skrivUt ikke implementert");
		
		String skrivut = "";
		
		for(int i = 0; i < matrise.length; ++i) {
			for(int j = 0; j < matrise[0].length; ++j) {
				skrivut += matrise[i][j] + ", ";
			}
			if(i == matrise.length-1) {
				skrivut = skrivut.substring(0, skrivut.length()-2);
			}
			else
				skrivut += "\n";
		}
		
		System.out.println(skrivut);
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO
		//throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
		
		String matriStreng = "";
		
		for(int i = 0; i < matrise.length; ++i) {
			for(int j = 0; j < matrise[0].length; ++j) {
				matriStreng += matrise[i][j] + " ";
			}
			matriStreng += "\n";
		}
		
		return matriStreng;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		//throw new UnsupportedOperationException("Metoden skaler ikke implementert");
		
		int[][] skalmatrise = new int[matrise.length][matrise[0].length];
		
		for(int i = 0; i < skalmatrise.length; ++i) {
			for(int j = 0; j < skalmatrise[0].length; ++j) {
				skalmatrise[i][j] = matrise[i][j] * tall;
			}
		}
		
		
		return skalmatrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		//throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
		boolean lik = true;
		
		for(int i = 0; i < a.length; ++i) {
			for(int j = 0; j < a[0].length; ++j) {
				if(a[i][j] != b[i][j]) {
					lik = false;
					break;
				}
			}
			if(lik == false)
				break;
		}
		
		
		
		return lik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		//throw new UnsupportedOperationException("Metoden speile ikke implementert");
		
		int[][] speilmatrise = new int[matrise.length][matrise[0].length];
		
		for(int i = speilmatrise.length-1; i >= 0; ++i) {
			for(int j = 0)
		}
		
		
		return speilmatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		//Antal radar i a MÅ vere lik antall colonnar i b!
		//throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
