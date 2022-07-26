package n1Exercici2;

public class Treballador {
	private String nom;
	private String cognom;
	private double preuHora;

	public Treballador(String nom, String cognom, double preuHora) {
		super();
		this.nom = nom;
		this.cognom = cognom;
		this.preuHora = preuHora;

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public double getPreuHora() {
		return preuHora;
	}

	public void setPreuHora(double preuHora) {
		this.preuHora = preuHora;
	}

	public void calcularSou(int horesTreballades) {

		double total = horesTreballades * preuHora;
		System.out.println("El meu nom es " + getNom() + getCognom() + "i el meu sou es de " + total + "€");

	}

	@Override
	public String toString() {
		return "Treballador [nom=" + nom + ", cognom=" + cognom + ", preuHora=" + preuHora + ", getNom()=" + getNom()
				+ ", getCognom()=" + getCognom() + ", getPreuHora()=" + getPreuHora() + "]";
	}
}
