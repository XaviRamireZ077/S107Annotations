package n1Exercici1;

public class TreballadorPresencial extends Treballador {

	private static int benzina = 120;

	public TreballadorPresencial(String nom, String cognom, double preuHora) {
		super(nom, cognom, preuHora);

	}

	@Override
	public void calcularSou(int horesTreballades) {
		double total = (horesTreballades * super.getPreuHora()) + benzina;
		System.out.println(
				"El meu nom es " + super.getNom() + super.getCognom() + "i el meu sou es de " + total + "Euros");
		// return super.calcularSou(horesTreballades);
	}

}
