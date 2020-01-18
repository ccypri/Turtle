package Turtle;
import java.util.*;



public class Defausse extends ActionDuJoueur {

	private static List<Carte> defausses1=new ArrayList<Carte>();
	private static List<Carte> defausses2=new ArrayList<Carte>();
	private static List<Carte> defausses3=new ArrayList<Carte>();
	private static List<Carte> defausses4=new ArrayList<Carte>();
	private static List<Carte> defausses;
	private static String choix3;
	private static Carte uneCarte;

	public Defausse () { };


	public static List<Carte> addDefausse(Carte carte) {
		getDefausse();
		defausses.add(carte);
		setDefausse(defausses);
		return defausses;
	}
	
	public static List<Carte> removeDefausse(){
		defausses=new ArrayList<Carte>();
		setDefausse(defausses);
		return defausses;
	}

	public static void setDefausse(List<Carte> pDefausses){
		defausses=pDefausses;
	}

	public static List<Carte> getDefausse(){
		return defausses;
	}

	public static void laDefausse() {
		scanner=new Scanner(System.in);
		System.out.println("Voulez-vous defausser votre main ? y/n");
		choix3=scanner.nextLine();
		if (choix3.contentEquals("y")) {
			initDefausse();
			//System.out.println(getDefausse()+"$$$$$");
			for (int i=DeckJoueur.getNombreDeCarte()-1;i>-1;i--) {
				uneCarte=DeckJoueur.getCarte(i);
				//System.out.println(uneCarte);
				Defausse.addDefausse(uneCarte);
				DeckJoueur.removeCarte(i);
			}
		}
	}
	public static List<Carte> initDefausse() {
		Joueur joueur=Joueur.getLesJoueurs();
		String nom =joueur.getNom();
		System.out.println(nom+"$");
		if(nom.contentEquals("J1")) {
			
			defausses=defausses1;
			//System.out.println(defausses+" d1!");
		}
		if(nom.contentEquals("J2")) {
			defausses=defausses2;
			//System.out.println(defausses+" d2!");
		}
		if(nom.contentEquals("J3")) {
			defausses=defausses3;
			//System.out.println(defausses+" d3!");
		}
		if(nom.contentEquals("J4")) {
			defausses=defausses4;
			//System.out.println(defausses+" d4!");
		}
		setDefausse(defausses);
		
		return defausses;
	}


}
