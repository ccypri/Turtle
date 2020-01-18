package Turtle;
import java.util.*;

public class Joueur extends Tortue{

	private String nom;
	private static int choice,tour,tours;
	private static Joueur joueur,tourJ;
	private static Joueur j1= new Joueur("Tortue","bleu",0,0,0,"J1") ;
	private static Joueur j2= new Joueur("Tortue","rouge",0,0,0,"J2") ;
	private static Joueur j3= new Joueur("Tortue","vert",0,0,0,"J3") ;	
	private static Joueur j4= new Joueur("Tortue","violet",0,0,0,"J4") ;
	private static List<String> joueurs=new ArrayList<>();
	private static List<String> deuxJoueurs=new ArrayList<>();
	private static List<String> troisJoueurs=new ArrayList<>();
	private static List<String> quatreJoueurs=new ArrayList<>();


	public Joueur() {
		super();
		nom="Inconnu";
	}

	public Joueur(String pType,String pCouleur,int pPosition,int pDirection,int pPos,String pNom) {
		super(pType,pCouleur,pPosition,pDirection,pPos);
		nom=pNom;
	}

	//get
	public String getNom() {
		return nom;
	}

	//set
	public void setNom(String pNom) {
		nom=pNom;
	}

	public static void setJoueurs(List<String> pJoueurs ) {
		joueurs=pJoueurs;
	}

	public static List<String> getJoueurs(){
		return joueurs;
	}
	public static void setTours(int pTours) {
		tours=pTours;
	}
	public static int getTours() {
		return tours;
	}

	public static Joueur getJoueur(int i) {
		//choice=Plateau.getChoice();
		if(i==1) {
			tourJ=j1;
		}
		if(i==2) {
			tourJ=j2;
		}
		if(i==3) {
			tourJ=j3;
		}
		if(i==4) {
			tourJ=j4;
		}

		return tourJ;
	}
	
	public static void initJoueurs() {
		deuxJoueurs.add("J1");
		deuxJoueurs.add("J2");
		troisJoueurs.add("J1");
		troisJoueurs.add("J2");
		troisJoueurs.add("J3");
		quatreJoueurs.add("J1");
		quatreJoueurs.add("J2");
		quatreJoueurs.add("J3");
		quatreJoueurs.add("J4");
		setTours(0);
	}

	public static Joueur lesJoueurs() {
		
		tour=getTours();
		//System.out.println(getTours());
		choice=Plateau.getChoice();
		if (choice==2) {
			
			setJoueurs(deuxJoueurs);
			if(joueurs.get(tour)=="J1") {
				joueur=j1;
				//System.out.println(joueur+" 1");
			}
			if(joueurs.get(tour)=="J2") {
				joueur=j2;
				//System.out.println(joueur+" 2");
			}
			tour+=1;
			if(tour==joueurs.size()) {
				tour=0;
			}
			//System.out.println(joueurs);
		}

		if (choice==3) {
			setJoueurs(troisJoueurs);
			if(joueurs.get(tour)=="J1") {
				joueur=j1;
				System.out.println(joueur+" 1");
			}
			if(joueurs.get(tour)=="J2") {
				joueur=j2;
				System.out.println(joueur+" 2");
			}
			if (joueurs.get(tour)=="J3") {
				joueur=j3;
				System.out.println(joueur+" 3");
			}
			tour+=1;
			if(tour==joueurs.size()) {
				tour=0;
			}
		}

		if (choice==4) {
			setJoueurs(quatreJoueurs);
			if(joueurs.get(tour)=="J1") {
				joueur=j1;
				System.out.println(joueur+" 1");
			}
			if(joueurs.get(tour)=="J2") {
				joueur=j2;
				System.out.println(joueur+" 2");
			}
			if (joueurs.get(tour)=="J3") {
				joueur=j3;
				System.out.println(joueur+" 3");
			}
			if(joueurs.get(tour)=="J4") {
				joueur=j4;
				System.out.println(joueur+" 4");
			}
			tour+=1;
			if(tour==joueurs.size()) {
				tour=0;
			}
			
		}
		
		setTours(tour);
		return joueur;
	}
	public static Joueur getLesJoueurs() {

		return joueur;
	}
	

}