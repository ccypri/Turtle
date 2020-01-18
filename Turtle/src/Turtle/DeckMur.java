package Turtle;

import java.util.ArrayList;
import java.util.List;

public class DeckMur {
	private static int nombreDeCarte;
	private static List<Carte> deckMur;
	private static List<Carte> deckMur1=new ArrayList<>();
	private static List<Carte> deckMur2=new ArrayList<>();
	private static List<Carte> deckMur3=new ArrayList<>();
	private static List<Carte> deckMur4=new ArrayList<>();
	private static int total=0;
	private static Carte laCarte;


	public DeckMur () { 
		nombreDeCarte=0;
		List<String> deckMur=new ArrayList<>();
	}

	public DeckMur(int pNombre,List<Carte> pDeckMur) {
		nombreDeCarte = pNombre;
		deckMur = pDeckMur;
	}


	public static void setNombreDeCarte () {
		nombreDeCarte = deckMur.size();
	}


	public static int getNombreDeCarte () {
		deckMur=initDeckMur();
		nombreDeCarte = deckMur.size();
		return nombreDeCarte;
	}


	public void setDeck (List<Carte> pDeckMur) {
		deckMur = pDeckMur;
	}

	public static List<Carte> getDeck(List<Carte> pDeckMur) {
		deckMur = pDeckMur;
		System.out.print("Murs du Joueur: ");
		for (int i=0;i<getNombreDeCarte();i++) {
			Carte uneCarte=deckMur.get(i);
			System.out.print(uneCarte.getCouleur()+" ");
		}
		System.out.println();
		return deckMur;
	}

	public static void addCarte(int nombreCarte){
		deckMur=initDeckMur();
		total=5-nombreCarte;
		if (total!=0) {
			for(int i=0;i<total;i++) {
				deckMur.add(Pioche.getGetMur());
				laCarte=deckMur.get(getNombreDeCarte()-1);
				Pioche.removeMur();
			}

		}
	}



	public static List<Carte> removeCarte(int i){
		deckMur=initDeckMur();
		Carte laCarte=deckMur.get(i);
		deckMur.remove(i);
		return deckMur;
	}

	public static Carte getCarte(int i) {
		deckMur=initDeckMur();
		Carte LAcarte=deckMur.get(i);
		return LAcarte;
	}

	public static List<Carte> initDeckMur() {
		Joueur joueur=Joueur.getLesJoueurs();
		String nom =joueur.getNom();
		if(nom.contentEquals("J1")) {
			deckMur=deckMur1;
		}
		if(nom.contentEquals("J2")) {
			deckMur=deckMur2;
		}
		if(nom.contentEquals("J3")) {
			deckMur=deckMur3;
		}
		if(nom.contentEquals("J4")) {
			deckMur=deckMur4;
		}
		return deckMur;

	}
}
