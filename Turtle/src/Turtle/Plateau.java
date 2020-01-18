package Turtle;
import java.lang.reflect.Array;
import java.util.*;



public class Plateau {
	private static Case plateau [] []=new Case [10][10];
	private static String [] symbole = {"B","B","B","B","B","B","B","B","B","B","B","o","o","o","o","o","o","o","o","B","B","o","o","o","o","o","o","o","o","B","B","o","o","o","o","o","o","o","o","B","B","o","o","o","o","o","o","o","o","B","B","o","o","o","o","o","o","o","o","B","B","o","o","o","o","o","o","o","o","B","B","o","o","o","o","o","o","o","o","B","B","o","o","o","o","o","o","o","o","B","B","B","B","B","B","B","B","B","B","B"};
	private static int choice;
	private static Scanner scanner;
	private Case limit= new Case(0,false,"limit");
	private static int a;
	private static Joueur j1;
	private static Joueur j2;
	private static Joueur j3;
	private static Joueur j4;
//	private static Joueur j1= new Joueur("Tortue","bleu",0,0,"J1") ;
//	private static Joueur j2= new Joueur("Tortue","rouge",0,0,"J2") ;
//	private static Joueur j3= new Joueur("Tortue","vert",0,0,"J3") ;	
//	private static Joueur j4= new Joueur("Tortue","violet",0,0,"J4") ;



	public Plateau () { };

	public static void setSymbole (String[] pSymbole) {
		symbole = pSymbole;
	}

	public static String[] getSymbole () {
		return symbole;
	}
	
	public static void setChoice() {
		scanner=new Scanner(System.in);
		System.out.println("A combien de personnes voulez-vous jouer ? (2,3 ou 4)");
		choice=scanner.nextInt();
		scanner.nextLine();
		
	}
	
	public static int getChoice() {
		return choice;
	}
	
	public static int initPlateau() {
		setChoice();
		getChoice();
		if (choice==2) {
			j1=Joueur.getJoueur(1);
			j2=Joueur.getJoueur(2);
			j1.setPosition(12);
			j2.setPosition(16);
			symbole[j1.getPosition()]=j1.getNom();
			symbole[j2.getPosition()]=j2.getNom();
			j1.setDirection(12);
			j2.setDirection(16);


			for(int i=18;i<89;i+=10) {
				symbole[i]="MP";		//place les murs de pierre
			}
			symbole[84]="J";	
		}
		if (choice==3) {
			j1=Joueur.getJoueur(1);
			j2=Joueur.getJoueur(2);
			j3=Joueur.getJoueur(3);
			j1.setPosition(11);
			j2.setPosition(14);
			j3.setPosition(17);
			j1.setDirection(11);
			j2.setDirection(14);
			j3.setDirection(17);
			
			symbole[j1.getPosition()]=j1.getNom();
			symbole[j2.getPosition()]=j2.getNom();
			symbole[j3.getPosition()]=j3.getNom();
			for(int i=18;i<89;i+=10) {
				symbole[i]="M";		//place les murs
			}
			symbole[81]="J";	//place le joyau
			symbole[84]="J";	//place le joyau
			symbole[87]="J";	//place le joyau
		}
		if (choice==4) {
			j1=Joueur.getJoueur(1);
			j2=Joueur.getJoueur(2);
			j3=Joueur.getJoueur(3);
			j4=Joueur.getJoueur(4);
			j1.setPosition(11);
			j2.setPosition(13);
			j3.setPosition(16);
			j4.setPosition(18);
			j1.setDirection(11);
			j2.setDirection(13);
			j3.setDirection(16);
			j4.setDirection(18);
				
			symbole[j1.getPosition()]=j1.getNom();
			symbole[j2.getPosition()]=j2.getNom();
			symbole[j3.getPosition()]=j3.getNom();
			symbole[j4.getPosition()]=j4.getNom();
			symbole[82]="J";	//place le joyau
			symbole[87]="J";	//place le joyau
			System.out.println(symbole[j4.getPosition()]+"!");

		}
		setAfficherPlateau();
		return choice;
		
		


	}


	public static void afficherPlateau(){
		Case aCase;
		for (int row=0;row<plateau.length;row++) {
			for (int col=0;col<plateau[0].length;col++) {
				aCase=plateau[row][col];
				aCase.getPrintCase();
			}

			System.out.println();
		}
	}
	
	public static void setAfficherPlateau() {
		a=0;
		for (int row=0;row<plateau.length;row++) {
			for (int col=0;col<plateau[0].length;col++) { 
				{
					plateau[row][col]=new Case(a,false,symbole[a]);
					a++; }
				if(symbole[a-1]!="o") {
					plateau[row][col].setPrintCase();
				}
			}
		}
	}
	
	


}
