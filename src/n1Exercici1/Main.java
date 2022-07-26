package n1Exercici1;

public class Main {

	/*
	 * Crea una jerarquia d’objectes amb tres classes: Treballador,
	 * TreballadorOnline i TreballadorPresencial.
	 * 
	 * La classe Treballador té els atributs nom, cognom, preu/hora, i el mètode
	 * calcularSou() que rep per paràmetre el nombre d'hores treballades i el
	 * multiplica pel preu/hora. Les classes filles l'han de sobreescriure,
	 * emprant @Override.
	 * 
	 * Des del main() de la classe Principal, fes les invocacions necessàries per
	 * demostrar el funcionament de l’anotació @Override.
	 * 
	 * En els treballadors presencials, el mètode per calcular el seu sou, rebrà per
	 * paràmetre el nombre d’hores treballades al mes. A l’hora de calcular el sou
	 * es multiplicarà el nombre d’hores treballades pel preu/hora, més el valor
	 * d'un atribut static anomenat benzina que afegirem en aquesta classe.
	 * 
	 * En els treballadors online, el mètode per calcular el seu sou rebrà per
	 * paràmetre el nombre d'hores treballades al mes. A l'hora de calcular el sou
	 * es multiplicarà el nombre d'hores treballades pel preu/hora i se li sumarà el
	 * preu de la tarifa plana d'Internet, que serà una constant de la classe
	 * TreballadorOnline.
	 */

	public static void main(String[] args) {

		Treballador treballador1 = new Treballador("Xavi", "Ramirez", 8.5);
		Treballador treballador2 = new TreballadorPresencial("Lucia", "Alvarez", 9.80);
		Treballador treballador3 = new TreballadorOnline("Samuel", "Umtiti", 12);

		// Invoquem el mètode calcularSou() en cadascun dels objectes creats
		// Passem el nombre d'hores treballades per paràmetre

		treballador1.calcularSou(160);
		treballador2.calcularSou(145);
		treballador3.calcularSou(90);
	}

}
