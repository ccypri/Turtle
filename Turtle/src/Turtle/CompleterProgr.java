package Turtle;
import java.util.*;



public class CompleterProgr extends ActionDuJoueur {


	private static int choix;
	private static Scanner scanner;
	private static int choice2;
	private static String choix3="n";

	public CompleterProgr() {
		super();
	}


	public static void CompleterProg() {
		scanner=new Scanner(System.in);
		choix=ActionDuJoueur.choix;
		DeckJoueur.initDeck();
		
		if (choix==1) {

			while(DeckJoueur.getNombreDeCarte()!=0 && choix3.contentEquals("n")) {
				System.out.println(Programme.getProg()+"!");
				DeckJoueur.getDeck(DeckJoueur.initDeck());
				System.out.println("Choisissez une carte à mettre dans le programme (0,1,2,3,4)");
				choice2=scanner.nextInt();
				scanner.nextLine();
				//int choice=Plateau.getChoice();

				Carte uneCarte=DeckJoueur.getCarte(choice2);
				Programme.getProg().addFirst(uneCarte);
				Programme.setProg(Programme.getProg());
				DeckJoueur.removeCarte(choice2);
				System.out.println("Avez vous terminé? y/n");
				choix3=scanner.nextLine();


			}
			Defausse.laDefausse();
			Programme.lesProgrammes().afficherProgr();
			DeckJoueur.addCarte(DeckJoueur.getNombreDeCarte ());
		}
		choix3="n";
		choix=0;
	}



}
