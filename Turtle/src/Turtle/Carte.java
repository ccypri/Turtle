package Turtle;
import java.util.*;


public class Carte {


	private String couleur;
	private String type;
	private int action;

	public Carte () { 
		couleur="Inconnu";
		type="Inconnu";
		action=0;
	}
	
	public Carte(String pCouleur,String pType,int pAction) {
		couleur=pCouleur;
		type=pType;
		action=pAction;
	}
	
	//set
	public void setCouleur (String pCouleur) {
		couleur = pCouleur;
	}

	public void setType (String pType) {
		type = pType;
	}
	
	public void setAction (int pAction) {
		action = pAction;
	}

	//get
	public String getCouleur () {
		return couleur;
	}

	public String getType () {
		return type;
	}
	
	public int getAction(){
		return action;
	}


}
