package n1Exercici2;

public class TreballadorPresencial extends Treballador {

	private static int benzina = 100;

	public TreballadorPresencial(String nom, String cognom, double preuHora) {
		super(nom, cognom, preuHora);

	}

	@Override
	public void calcularSou(int horesTreballades) {
		double total = (horesTreballades * super.getPreuHora()) + benzina;
		System.out.println(
				"El meu nom es " + super.getNom() + super.getCognom() + " i el meu sou es de " + total + " Euros");
		// return super.calcularSou(horesTreballades);
	}

	@Deprecated
	public void descans() {
		System.out.println("Estic relaxan la vista un moment");

	}

}
