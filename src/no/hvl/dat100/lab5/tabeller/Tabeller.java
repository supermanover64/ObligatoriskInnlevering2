package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		//throw new UnsupportedOperationException("Metoden skrivUt ikke implementert");
		
		for(int tal = 0; tal < tabell.length; ++tal){
			System.out.print(tabell[tal]);
			if(tal != tabell.length-1)
				System.out.print(", ");
		}

		System.out.println();

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		//throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
		
		String tabellstreng = "[";

		for(int tal = 0; tal < tabell.length; ++tal){
			tabellstreng += tabell[tal];
			if(tal != tabell.length-1)
				tabellstreng += ",";
		}

		tabellstreng += "]";
		

		return tabellstreng;
		
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		//throw new UnsupportedOperationException("Metoden summer ikke implementert");
		
		int sum = 0;

		for(int tal: tabell){
			sum += tal;
		}

		/* 

		While-versjon:

		int tal = 0;
		while(tal < tabell.length){
			sum += tabell[tal];
			
			++tal;
		}

		Vanleg for-løkke-versjon:

		for(int tal = 0; tal < tabell.length; ++tal){
			sum += tabell[tal];
		}

		*/

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		//throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");
		
		boolean funne = false;

		for(int v: tabell){
			if(v == tall){
				funne = true;
				break;
			}
		}

		return funne;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		//throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");

		
		int forsteindex = -1;

		for(int i = 0; i < tabell.length; ++i){
			if(tabell[i] == tall){
				forsteindex = i;
				break;
			}
		}

		return forsteindex;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		//throw new UnsupportedOperationException("Metoden reverser ikke implementert");
		
		int[] nytabell = new int[tabell.length];

		for(int i = 0; i < nytabell.length; ++i){
			nytabell[i] = tabell[tabell.length-1-i];
		}

		return nytabell;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		//throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
		
		boolean erSortert = true;
		
		for(int i = 0; i < tabell.length; ++i) {
			if(i>0) {
				if(tabell[i-1] < tabell[i])
					continue;
				else {
					erSortert = false;
					break;
				}
					
			}
		}
		
		return erSortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		//throw new UnsupportedOperationException("Metoden settSammen ikke implementert");
		
		int[] samtabell = new int[tabell1.length + tabell2.length];
		
		for(int i = 0; i < tabell1.length; ++i) {
			samtabell[i] = tabell1[i];
		}
		
		for(int i = 0; i < tabell2.length; ++i) {
			samtabell[i+tabell1.length] = tabell2[i];
		}
		
		return samtabell;
	}
}
