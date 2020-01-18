package Turtle;
import java.util.*;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;




public class MainTurtle {

	static boolean fin=false;
	private static List<String> classement=new ArrayList<>();
	


	public static void main(String [] args) throws UnsupportedLookAndFeelException {
		MainTurtle Jeu=new MainTurtle();
		
	}

	MainTurtle() throws UnsupportedLookAndFeelException{
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		Fenetre fen = new Fenetre();
		
		

		//Pioche.setCartes();
		
		System.out.println(Pioche.getCartes());
		Pioche.setMurs();
		Plateau.initPlateau();
		Joueur.initJoueurs();
		for (int i=0;i<Plateau.getChoice();i++) {
			Joueur.lesJoueurs();
			Pioche.setIniCartes();
			Pioche.shuffle(Pioche.getCartes());
			DeckJoueur.addCarte(DeckJoueur.getNombreDeCarte());
			DeckMur.addCarte(DeckMur.getNombreDeCarte());
			
		}
		while(fin==false) {
			Plateau.afficherPlateau();
			Joueur.lesJoueurs();
			Pioche.initPioche();
			//System.out.println(Pioche.getCartes()+" "+Joueur.getLesJoueurs().getNom());
			DeckJoueur.getDeck(DeckJoueur.initDeck());
			DeckMur.getDeck(DeckMur.initDeckMur());
			ActionDuJoueur.getChoix();
			CompleterProgr.CompleterProg();
			ConstruireMur.ConstruMur();
			ExecuterProgr.ExecutProgr();
			
		}

		Plateau.afficherPlateau();

	}

	public static void setFin(boolean pFin) {
		fin=pFin;
	}
	
	public static boolean getFin() {
		return fin;
	}
	
	public static void setClassement(List<String> pClassement) {
		classement=pClassement;
		
	}
	public static List<String> getClassement() {
		return classement;
	}




}
