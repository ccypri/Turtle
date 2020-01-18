package Turtle;

import java.util.ArrayDeque;

public class Laser extends Carte {

	private static Joueur joueur,Ajoueur;
	private static int[] dep= {10,1,-10,-1};
	private static int pos=0,length,b,c,Apos,Aposition;
	private static String[] symbole;
	private static int choice;
	//	private static Programme programme;
	//	protected static ArrayDeque<Carte> prog;

	public Laser() {
		super();
	}

	public static void tir() {
		choice=Plateau.getChoice();
		System.out.println("TIR");
		symbole=Plateau.getSymbole();
		joueur=Joueur.getLesJoueurs();
		int position=joueur.getPosition();
		pos=joueur.getPos();
		int a=dep[pos];
		if(a==1) {
			length=9-pos;
		}
		if(a==-1) {
			length=pos;
		}
		if(a==10) {
			c=pos/10;
			b=length%10;
			length=10-1;
		}
		if(a==-10) {
			c=pos/10;
			b=length%10;
			length=b;

		}
		for (int b=1;b<length;b++) {
			int newPos=position+a*b;
			if (symbole[newPos].contentEquals("MG")) {
				symbole[newPos]="o";
				break;
			}
			if (symbole[newPos].contentEquals("MP")) {
				break;
			}

			if (choice==2) {
				if (symbole[newPos].contentEquals("J1")) {
					Ajoueur=Joueur.getJoueur(1);
					Apos=Ajoueur.getPos();
					for (int i=0;i<2;i++) {
						Apos+=1;
						if(Apos==4) {
							Apos=0;
						}
					}
					Ajoueur.setPos(Apos);
					break;
				}
				if (symbole[newPos].contentEquals("J2")) {
					Ajoueur=Joueur.getJoueur(2);
					Apos=Ajoueur.getPos();
					for (int i=0;i<2;i++) {
						Apos+=1;
						if(Apos==4) {
							Apos=0;
						}
					}
					Ajoueur.setPos(Apos);
					break;
				}
				if (symbole[newPos].contentEquals("J")){
					Ajoueur=Joueur.getLesJoueurs();
					Apos=Ajoueur.getPos();
					for (int i=0;i<2;i++) {
						Apos+=1;
						if(Apos==4) {
							Apos=0;
						}
					}
					Ajoueur.setPos(Apos);
					break;
				}
			}
			else {
				if (symbole[newPos].contentEquals("J1")) {
					Ajoueur=Joueur.getJoueur(1);
					Aposition=Ajoueur.getPosition();
					symbole[newPos]="o";
					symbole[Aposition]=Ajoueur.getNom();
					break;
				}
				if (symbole[newPos].contentEquals("J2")) {
					Ajoueur=Joueur.getJoueur(2);
					Aposition=Ajoueur.getPosition();
					symbole[newPos]="o";
					symbole[Aposition]=Ajoueur.getNom();
					break;
				}
				if (symbole[newPos].contentEquals("J3")) {
					Ajoueur=Joueur.getJoueur(3);
					Aposition=Ajoueur.getPosition();
					symbole[newPos]="o";
					symbole[Aposition]=Ajoueur.getNom();
					break;
				}
				if (symbole[newPos].contentEquals("J4")) {
					Ajoueur=Joueur.getJoueur(4);
					Aposition=Ajoueur.getPosition();
					symbole[newPos]="o";
					symbole[Aposition]=Ajoueur.getNom();
					break;
				}
				if (symbole[newPos].contentEquals("J")){
					Ajoueur=Joueur.getLesJoueurs();
					Aposition=Ajoueur.getPosition();
					symbole[newPos]="o";
					symbole[Aposition]=Ajoueur.getNom();
					break;
				}
			}
		}
	}

}


