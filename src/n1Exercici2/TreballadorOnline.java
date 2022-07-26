package n1Exercici2;

public class TreballadorOnline extends Treballador {

	final int tarifaPlana = 25;

	public TreballadorOnline(String nom, String cognom, double preuHora) {
		super(nom, cognom, preuHora);

	}

	@Override
	public void calcularSou(int horesTreballades) {

		double total = (horesTreballades * super.getPreuHora()) + tarifaPlana;
		System.out.println("El meu nom és " + super.getNom() + super.getCognom() + "i el meu sou és de " + total + "€");

	}

	@Deprecated

	public void caminar() {
		System.out.println("Vaig a estirar les cames 1 minut");
	}

}