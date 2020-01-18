package Turtle;
import java.util.*;


public class Programme {

	protected static int taille;
	protected static String statut;
	protected static ArrayDeque<Carte> prog;
	private static Programme programme,programmeJ;
	private static ArrayDeque<Carte> prog1=new ArrayDeque<Carte>();
	private static ArrayDeque<Carte> prog2=new ArrayDeque<Carte>();
	private static ArrayDeque<Carte> prog3=new ArrayDeque<Carte>();
	private static ArrayDeque<Carte> prog4=new ArrayDeque<Carte>();
	private static Programme programme1=new Programme(0,"vide",prog1);
	private static Programme programme2=new Programme(0,"vide",prog2);
	private static Programme programme3=new Programme(0,"vide",prog3);
	private static Programme programme4=new Programme(0,"vide",prog4);
	
	protected static Carte uneCarte;


	public Programme () { 
		taille=0;
		statut="Inconnu";

	}

	public Programme(int pTaille,String pStatut,ArrayDeque<Carte> pProgramme) {
		taille = pTaille;
		statut = pStatut;
		prog = pProgramme;
	}

	public static ArrayDeque<Carte> getProgramme(){
		uneCarte=prog.getLast();
		removeCarte(uneCarte);

		return prog;
	}

	public void afficherProgr() {
		System.out.println(prog);
	}

	//  public Carte getCarte(int i) {
	//		Carte LAcarte=programme.get(i);
	//		return LAcarte;
	//	}

	//set
	public void setTaille (int pTaille) {
		taille = pTaille;
	}

	public void setStatut (String pStatut) {
		statut = pStatut;
	}

	//set
	public static int getTaille () {
		taille=prog.size()-1;
		return taille;
	}

	public String getStatut () {
		return statut;
	}

	public static void setProg(ArrayDeque<Carte> pProgramme) {
		prog=pProgramme;
	}

	public static ArrayDeque<Carte> getProg () {
		return prog;
	}

	public void addCarte(Carte carte){
		prog.addFirst(carte);
	}

	public static void removeCarte(Carte carte){
		prog.remove(carte);
	}
	
	public static Programme getProgrammes(int i) {
			if(i==1) {
				programmeJ=programme1;
			}
			if(i==2) {
				programmeJ=programme2;
			}
			if(i==3) {
				programmeJ=programme3;
			}
			if(i==4) {
				programmeJ=programme4;
			}
		
		return programmeJ;
	}

	public static Programme lesProgrammes() {
		Joueur joueur=Joueur.getLesJoueurs();
		String nom =joueur.getNom();
		System.out.println(nom);
		if(nom.contentEquals("J1")) {
			programme=programme1;
			setProg(prog1);
		}
		if(nom.contentEquals("J2")) {
			programme=programme2;
			setProg(prog2);
		}
		if(nom.contentEquals("J3")) {
			programme=programme3;
			setProg(prog3);
		}
		if(nom.contentEquals("J4")) {
			programme=programme4;
			setProg(prog4);
		}

		return programme;
	}

}
