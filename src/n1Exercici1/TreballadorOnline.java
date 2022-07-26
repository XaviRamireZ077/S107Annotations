package n1Exercici1;

public class TreballadorOnline extends Treballador {

	private final double tarifaPlana = 33;

	public TreballadorOnline(String nom, String cognom, double preuHora) {
		super(nom, cognom, preuHora);

	}

	@Override
	public void calcularSou(int horesTreballades) {

		double total = (horesTreballades * super.getPreuHora()) + tarifaPlana;
		System.out.println(
				"El meu nom es " + super.getNom() + super.getCognom() + "i el meu sou es de " + total + "Euros");

//		super.calcularSou(horesTreballades);
	}

}
