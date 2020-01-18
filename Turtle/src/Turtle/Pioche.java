package Turtle;
import java.lang.reflect.Array;
import java.util.*;

public class Pioche {

	private static int taille,tailleM;
	private static List<Carte> cartes=new ArrayList<Carte>();
	private static List<Carte> murs=new ArrayList<Carte>();
	static Carte MurGlace=new Carte("MG","fixe",10);
	static Carte MurPierre=new Carte("MP","fixe",10);
	private static Carte carte,mur;
	static Carte carteBleue=new Carte("carteBleue","mouvement",0);
	static Carte carteJaune=new Carte("carteJaune","mouvement",1);
	static Carte carteViolette=new Carte("carteViolette","mouvement",-1);
	static Carte carteLaser=new Carte("carteLaser","laser",5);

	private static List<Carte> pioche;
	private static List<Carte> pioche1=new ArrayList<>();
	private static List<Carte> pioche2=new ArrayList<>();
	private static List<Carte> pioche3=new ArrayList<>();
	private static List<Carte> pioche4=new ArrayList<>();


	public Pioche () { };

	public Pioche(int pTaille) {
		taille=0;
	}

	//set
	//	public static void setGetCarte () {
	//		carte = cartes.get(getTaille());
	//	}

	public void setTaille () {
		taille = cartes.size();
	}

	//get
	public static Carte getGetCarte () {
		carte = cartes.get(getTaille());
		return carte;
	}

	public static int getTaille () {
		taille = cartes.size()-1;
		return taille;
	}

	public static List<Carte> removeCarte(){
		int taille=getTaille();
		cartes.remove(taille);
		return cartes;
	}



	public void setTailleM () {
		tailleM = murs.size();
	}

	//get
	public static Carte getGetMur () {
		mur = murs.get(getTailleM());
		return mur;
	}

	public static int getTailleM () {
		tailleM = murs.size()-1;
		return tailleM;
	}

	public static List<Carte> removeMur(){
		int tailleM=getTailleM();
		murs.remove(tailleM);
		return murs;
	}

	public static List<Carte> getCartes(){
		return cartes;
	}

	public static void setCartes(List<Carte> pCartes) {
		cartes=pCartes;

	}

	public static void setIniCartes(){
		cartes=initPioche();

		for (int times=0;times<18;times++) {
			cartes.add(carteBleue);
		}
		for (int times=18;times<26;times++) {
			cartes.add(carteJaune);
		}
		for (int times=26;times<34;times++) {
			cartes.add(carteViolette);
		}
		for (int times=34;times<37;times++) {
			cartes.add(carteLaser);
		}
		//System.out.println(cartes);
		setCartes(cartes);

	}
	public static List<Carte> setMurs(){
		for (int i=0;i<4;i++) {
			for (int times=0+(6*i);times<4+(6*i);times++) {
				murs.add(MurPierre);
			}
			for (int times=4+(6*i);times<6+(6*i);times++) {
				murs.add(MurGlace);
			}	
		}
		return murs;
	}

	public static List<Carte> shuffle(List<Carte> list){
		Collections.shuffle(list);
		return list;
	}

	public static List<Carte> initPioche() {
		Joueur joueur=Joueur.getLesJoueurs();
		String nom =joueur.getNom();
		System.out.println(nom+"$");
		if(nom.contentEquals("J1")) {
			
			cartes=pioche1;
			//System.out.println(cartes+" 1!");
		}
		if(nom.contentEquals("J2")) {
			cartes=pioche2;
			//System.out.println(cartes+" 2!");
		}
		if(nom.contentEquals("J3")) {
			cartes=pioche3;
			//System.out.println(cartes+" 3!");
		}
		if(nom.contentEquals("J4")) {
			cartes=pioche4;
			//System.out.println(cartes+" 4!");
		}
		setCartes(cartes);
//		System.out.println(pioche1+" p1!");
//		System.out.println(pioche2+" p2!");
		return cartes;

	}
	public static List<Carte> setInitPioche( List<Carte> cartes) {
		Joueur joueur=Joueur.getLesJoueurs();
		String nom =joueur.getNom();
		System.out.println(nom+"$");
		if(nom.contentEquals("J1")) {
			
			pioche1=cartes;
			//System.out.println(cartes+" 1!");
		}
		if(nom.contentEquals("J2")) {
			pioche2=cartes;
			//System.out.println(cartes+" 2!");
		}
		if(nom.contentEquals("J3")) {
			pioche3=cartes;
			//System.out.println(cartes+" 3!");
		}
		if(nom.contentEquals("J4")) {
			pioche4=cartes;
			//System.out.println(cartes+" 4!");
		}
		setCartes(cartes);
		return cartes;

	}


}





