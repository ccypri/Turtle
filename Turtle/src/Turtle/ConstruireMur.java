package Turtle;
import java.util.*;



public class ConstruireMur extends ActionDuJoueur {
	private static int choix;
	private static Scanner scanner;
	private static int choice2,choice1;
	private static String[] symbole;

	public static void ConstruMur() {
		scanner=new Scanner(System.in);
		choix=ActionDuJoueur.choix;
		symbole=Plateau.getSymbole();
		DeckMur.initDeckMur();
		if (choix==2){
			while(!symbole[choice1].contentEquals("o")) {
				Plateau.afficherPlateau();
				DeckMur.getDeck(DeckMur.initDeckMur());
				System.out.println("Où voulez-vous construire le mur?");
				choice1=scanner.nextInt();
				scanner.nextLine();
			}
			System.out.println("Choisissez le mur à placer (0,1,2,3,4)");
			choice2=scanner.nextInt();
			scanner.nextLine();
			Carte uneCarte=DeckMur.getCarte(choice2);
			symbole[choice1]=uneCarte.getCouleur();
			DeckMur.removeCarte(choice2);
			Plateau.setSymbole(symbole);
			Plateau.setAfficherPlateau();
			Defausse.laDefausse();
		}
		choix=0;
		choice1=0;
		

	}
}