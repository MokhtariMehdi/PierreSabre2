package personnages;

public class Humain {
	private String nom;
	private String boisson_pref;
	private int argent;
	
	public Humain(String nom,String boisson_pref,int argent) {
		this.nom =nom;
		this.boisson_pref =boisson_pref;
		this.argent =argent;
	}

	public void direBonjour(String nom,String boisson_pref) {
		System.out.println("Bonjour ! Je m’appelle " + nom + "et j’aime boire du " + boisson_pref );
	}
	
	public void boire() {
		System.out.println("Mmm, un bon verre de " + boisson_pref + "! GLOUPS !");
	}
	
	

}
