package Turtle;
import java.util.*;



public class ActionDuJoueur {

	public static int choix;
	public static Scanner scanner;

	public ActionDuJoueur () { 
		choix=0;
	}
	
	public ActionDuJoueur(int pChoix) {
		choix=pChoix;
	}

	public static int getChoix() {
		Programme.lesProgrammes();
		scanner=new Scanner(System.in);
		System.out.println("1- Compléter le programme \r\n" + "2- Construire un mur \r\n" + "3- Exécuter le programme");
		choix=scanner.nextInt();
		scanner.nextLine();
		return choix;
	}



	public void setChoix(int pChoix){
		choix = pChoix ;
		
	}


}
