package n1Exercici2;


public class Main {

	/*
	 * Afegeix a les classes filles alguns mètodes obsolets (deprecated), i utilitza
	 * l’anotació corresponent. Invoca des d'una classe externa els mètodes
	 * obsolets, suprimint mitjançant l'anotació corresponent els “warnings” per ser
	 * obsolets.
	 */

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		
		TreballadorPresencial treballador2 = new TreballadorPresencial("Lucia", "Alvarez", 9.80);
		TreballadorOnline treballador3 = new TreballadorOnline("Samuel", "Umtiti", 12);
		
		
		
		//Invoquem els mètodes @Deprecated
	
		treballador2.descans();
		treballador3.caminar();

	
	}

}
