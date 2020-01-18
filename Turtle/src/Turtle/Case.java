package Turtle;
import java.util.*;

public class Case {

	private int emplacement;
	private boolean statut;
	private String type;
	private int nombreTuile;
	boolean showing;
	String back;
	int front;

	public Case() {

	}

	public Case(int pEmplacement,boolean pStatut,String pType) {
		emplacement=pEmplacement;
		statut=pStatut;
		type=pType;
	}

	public void initCase(String type,int position) {

	}

	public void getPrintCase() {
		if (showing) {
			System.out.print(String.format("%10s", type+" "));
		}
		else {
			System.out.print(String.format("%10s","["+emplacement+"]"));
		}
	}

	public boolean setPrintCase() {
		if (showing==true) {
			showing=false;
		}
		else {
			showing=true;
		}
		return showing;
	}


	//get
	public int getEmplacement() {
		return emplacement;
	}

	public boolean getStatut() {
		return statut;
	}

	public String getType() {
		return type;
	}

	//set
	public void setEmplacement(int pEmplacement) {
		emplacement=pEmplacement;
	}

	public void setStatut(boolean pStatut) {
		statut=pStatut;
	}

	public void setType(String pType) {
		type=pType;
	}

}