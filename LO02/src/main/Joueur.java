package main;

import java.util.ArrayList;

public class Joueur {

	private int score,id;
	protected ArrayList<Carte> sesCartes;
	private String nom;
	protected Carte carteChoisi;
	protected int numCarte;
	
	public Joueur(String nom, int id) {
		super();
		this.nom = nom;
		sesCartes = new ArrayList<Carte>();
		this.id = id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void choisirUneCarte(Tas leTas, Paquet lePaquet) {
		
	}
	
	public void poserCarte(Tas leTas, Paquet lePaquet) {
		
		if (comparerCarte(leTas)) {
			leTas.addCartesDessous(leTas.getCarteVisible());
			leTas.setCarteVisible(carteChoisi);
			sesCartes.remove(numCarte-1);
			if (this instanceof JoueurArtificiel) {
				System.out.println("L'"+this.getNom()+" joue : " + leTas.getCarteVisible());
			}
			leTas.afficherCarteVisible();
		} else if (this instanceof JoueurPhysique) {
			System.out.println("\nCarte non valide. Choisis en une autre.");
			choisirUneCarte(leTas,lePaquet);
		}
		
		
	}
	
	public ArrayList<Carte> getSesCartes() {
		return sesCartes;
	}

	/*public void getSesCartes() {
		for (int i=0;i<sesCartes.size();i++) {
			System.out.println(sesCartes.get(i));
		}
	} */
	
	public void setSesCartes(ArrayList<Carte> sesCartes) {
		this.sesCartes = sesCartes;
	}

	public boolean comparerCarte(Tas leTas) {
		if (carteChoisi.getValeur() == leTas.getCarteVisible().getValeur()|| carteChoisi.getCouleur() == leTas.getCarteVisible().getCouleur()) {
			return true;
		} else {
			return false;
		}
	}

	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}
	
}