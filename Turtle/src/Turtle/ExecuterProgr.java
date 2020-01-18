package Turtle;
import java.util.*;


/**
 * Class ExecuterProgr
 */
public class ExecuterProgr extends ActionDuJoueur {
	private static int choix;
	private static Scanner scanner;
	private static int choice,pos=0,b=0,a;
	private static Joueur joueur,Ajoueur;
	private static String[] symbole;
	private static int[] dep= {10,1,-10,-1};
	private static int Apos,AnewPos,AanciennePos;
	private static boolean fin=false;
	private static List<String> modifJoueurs=new ArrayList<>();
	private static List<String> classement=new ArrayList<>();

	public ExecuterProgr () {
		super();
	}

	public static void ExecutProgr() {
		scanner=new Scanner(System.in);
		choix=ActionDuJoueur.choix;
		symbole=Plateau.getSymbole();
		if (choix==3) {
			do {
				Programme.getProgramme();
				Carte uneCarte=Programme.uneCarte;
				System.out.println(uneCarte);
				Defausse.addDefausse(uneCarte);
				int action=uneCarte.getAction();
				joueur=Joueur.getLesJoueurs();
				System.out.println("Execution du programme");
				int anciennePos=joueur.getPosition();
				pos=joueur.getPos();
				if(action!=5) {
					pos+=action;
					if(pos==-1) {
						pos=3;
					}
					if(pos==4) {
						pos=0;
					}
					if(action==0) {
						b=1;
					}
					a=dep[pos];
					int newPos=anciennePos+a*b;
					if( symbole[newPos].contentEquals("MP")|| symbole[newPos].contentEquals("MG")) {
						for (int i=0;i<2;i++) {
							pos+=1;
							if(pos>=4) {
								pos=0;
							}
						}
						a=dep[pos];
						newPos=anciennePos+a*b;
					}
					if( symbole[newPos].contentEquals("B")) {
						pos=0;
						newPos=joueur.getDirection();
					}
					if( symbole[newPos].contentEquals("J1") && b==1) {
						pos=0;
						newPos=joueur.getDirection();
						Ajoueur=Joueur.getJoueur(1);
						AanciennePos=Ajoueur.getPosition();
						Apos=0;
						AnewPos=Ajoueur.getDirection();
						symbole[AanciennePos]="o";
						Ajoueur.setPos(Apos);
						Ajoueur.setPosition(AnewPos);
						symbole[AnewPos]=Ajoueur.getNom();
					}
					if( symbole[newPos].contentEquals("J2") && b==1) {
						pos=0;
						newPos=joueur.getDirection();
						Ajoueur=Joueur.getJoueur(2);
						AanciennePos=Ajoueur.getPosition();
						Apos=0;
						AnewPos=Ajoueur.getDirection();
						symbole[AanciennePos]="o";
						Ajoueur.setPos(Apos);
						Ajoueur.setPosition(AnewPos);
						symbole[AnewPos]=Ajoueur.getNom();
					}
					if( symbole[newPos].contentEquals("J3") && b==1) {
						pos=0;
						newPos=joueur.getDirection();
						Ajoueur=Joueur.getJoueur(3);
						AanciennePos=Ajoueur.getPosition();
						Apos=0;
						AnewPos=Ajoueur.getDirection();
						symbole[AanciennePos]="o";
						Ajoueur.setPos(Apos);
						Ajoueur.setPosition(AnewPos);
						symbole[AnewPos]=Ajoueur.getNom();
					}
					if( symbole[newPos].contentEquals("J4") && b==1) {
						pos=0;
						newPos=joueur.getDirection();
						Ajoueur=Joueur.getJoueur(4);
						AanciennePos=Ajoueur.getPosition();
						Apos=0;
						AnewPos=Ajoueur.getDirection();
						symbole[AanciennePos]="o";
						Ajoueur.setPos(Apos);
						Ajoueur.setPosition(AnewPos);
						symbole[AnewPos]=Ajoueur.getNom();
					}

					if( symbole[newPos].contentEquals("J")){
						modifJoueurs=Joueur.getJoueurs();
						String nom=joueur.getNom();
						classement.add(nom);
						MainTurtle.setClassement(classement);
						modifJoueurs.remove(nom);
						Joueur.setJoueurs(modifJoueurs);
						symbole[anciennePos]="o";
						Plateau.setSymbole(symbole);
						Plateau.setAfficherPlateau();
						Joueur.setTours(0);
						if (Joueur.getJoueurs().size()==1) {
							classement=MainTurtle.getClassement();
							choice=Plateau.getChoice();
							String premier=classement.get(0);
							String deuxieme=classement.get(1);
							String troisieme=classement.get(2);
							String quatrieme=classement.get(3);
							if (choice==2) {
								System.out.println("Le premier est "+premier+" le deuxieme est "+deuxieme);
							}
							if (choice==3) {
								System.out.println("Le premier est "+premier+" le deuxieme est "+deuxieme+" le troisieme est "+troisieme);
							}
							if(choice==4) {
								System.out.println("Le premier est "+premier+" le deuxieme est "+deuxieme+" le troisieme est "+troisieme+" le quatrieme est "+quatrieme);
							}

							MainTurtle.setFin(true);
						}
						break;

					}	

					b=0;
					symbole[anciennePos]="o";
					joueur.setPos(pos);
					joueur.setPosition(newPos);
					System.out.println(joueur.getPosition());

					symbole[newPos]=joueur.getNom();



				}
				else {
					Laser.tir();
				}
				Plateau.setSymbole(symbole);
				Plateau.setAfficherPlateau();
				Plateau.afficherPlateau();

			}while(Programme.getProg().isEmpty()==false);

			Defausse.laDefausse();
		}


	}
}
