package Turtle;

public class Tuile{
	
	protected String type;
	protected String couleur;
	protected int position;
	
	public Tuile() {
		
	}
	
	public Tuile(String pType,String pCouleur,int pPosition) {
		type=pType;
		couleur=pCouleur;
		position=pPosition;
	}
	
	//get
	public String getType() {
		return type;
	}
	
	public String getCouleur() {
		return couleur;
	}
	
	public int getPosition() {
		return position;
	}
	
	//set
	public void setType(String pType) {
		type=pType;
	}
	
	public void setCouleur(String pCouleur) {
		couleur=pCouleur;
	}
	
	public void setPosition(int pPosition) {
		position=pPosition;
	}
	
}