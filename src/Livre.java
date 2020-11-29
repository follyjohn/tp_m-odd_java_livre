public class Livre implements IBookHandler{

	// attributs
	private String titre;
	private String auteur;
	private int nbPage;
	public LivrePersistant livrePersistant;

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getNbPage() {
		return nbPage;
	}

	public void setNbPage(int nbPage) {
		this.nbPage = nbPage;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	@Override
	public String toString() {
		return titre + " : " + auteur + " - " + nbPage;
	}

	@Override
	public void imprimer() {
		System.out.println("Impression du livre " + titre + " en cours...");
	}


	public Livre(String titre, String auteur, int nbPage) {
		this.auteur = auteur;
		this.nbPage = nbPage;
		this.titre = titre;
		this.livrePersistant = new LivrePersistant();
	}

}