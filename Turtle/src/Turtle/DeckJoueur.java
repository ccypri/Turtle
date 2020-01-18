package Turtle;
import java.util.*;


public class DeckJoueur {

	private static List<Carte> pioche;
	private static int nombreDeCarte;
	private static List<Carte> deck,deckI;
	private static List<Carte> deck1=new ArrayList<>();
	private static List<Carte> deck2=new ArrayList<>();
	private static List<Carte> deck3=new ArrayList<>();
	private static List<Carte> deck4=new ArrayList<>();
	private static int total=0;
	private static Carte laCarte,LAcarte;





	public DeckJoueur () { 
		nombreDeCarte=0;
		List<String> deck=new ArrayList<>();
	}

	public DeckJoueur(int pNombre,List<Carte> pDeck) {
		nombreDeCarte = pNombre;
		deck = pDeck;
	}


	public static void setNombreDeCarte () {
		nombreDeCarte = deck.size();
	}


	public static int getNombreDeCarte () {
		deck=initDeck();
		nombreDeCarte = deck.size();
		return nombreDeCarte;
	}


	public void setDeck (List<Carte> pDeck) {
		deck = pDeck;
	}

	public static List<Carte> getDeck(List<Carte> pDeck) {
		deck = pDeck;
		System.out.print("Deck Joueur: ");
		for (int i=0;i<getNombreDeCarte();i++) {
			Carte uneCarte=deck.get(i);
			System.out.print(uneCarte.getCouleur()+" ");
		}
		System.out.println();
		System.out.println(deck);
		return deck;
	}

	public static void addCarte(int nombreCarte){
//		deck=initDeck();
//		total=5-nombreCarte;
		Pioche.initPioche();
		
		deck=initDeck();
		//System.out.println(deck+"MMMMM");
		total=5-nombreCarte;
		if (total!=0) {
			for(int i=0;i<total;i++) {
				if (Pioche.getCartes().isEmpty()) {
					System.out.println("nouvelle Pioche!");
					deckI=Defausse.getDefausse();
					
					deckI=Pioche.shuffle(deckI);
					//System.out.println(deckI+"$$$");
					Pioche.setInitPioche(deckI);
					Defausse.removeDefausse();
				}
				deck.add(Pioche.getGetCarte());
				laCarte=deck.get(getNombreDeCarte()-1);
				Pioche.removeCarte();
			}

		}
	}



	public static List<Carte> removeCarte(int i){
		deck=initDeck();
		Carte laCarte=deck.get(i);

		deck.remove(i);
		return deck;
	}
	public static Carte getCartes() {
		deck=initDeck();
		for (int i=0;i<getNombreDeCarte();i++) {
			LAcarte=deck.get(i);
		}
		return LAcarte;
	}

	public static Carte getCarte(int i) {
		deck=initDeck();
		Carte LAcarte=deck.get(i);
		return LAcarte;
	}

	public static List<Carte> initDeck() {
		Joueur joueur=Joueur.getLesJoueurs();
		String nom =joueur.getNom();
		if(nom.contentEquals("J1")) {
			deck=deck1;
		}
		if(nom.contentEquals("J2")) {
			deck=deck2;
		}
		if(nom.contentEquals("J3")) {
			deck=deck3;
		}
		if(nom.contentEquals("J4")) {
			deck=deck4;
		}
		return deck;

	}



}
