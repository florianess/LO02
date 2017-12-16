package Joueurs;

import Jeu.Paquet;
import Jeu.Tas;
import main.Manche;
import strategie.Difficulte;

public class JoueurArtificiel extends Joueur {

	private Difficulte niveau;

	public JoueurArtificiel(String nom, byte id, Difficulte niveau) {
		super(nom, id);
		this.niveau = niveau;
	}

	public void choisirUneCarte(Tas leTas, Paquet lePaquet, Manche laManche) {
		numCarte = 1;
		carteChoisi = sesCartes.get(numCarte - 1);
		niveau.appliquer(leTas,lePaquet,this,laManche);
	}

	@Override
	public void trierCartes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afficherCartes() {
		// TODO Auto-generated method stub
		
	}

}
