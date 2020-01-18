package Turtle;
import java.util.*;

public class Tortue extends Tuile{
	
	private int direction,pos;
	
	public Tortue() {
		super();
		direction=0;
	}
	
	public Tortue(String pType,String pCouleur,int pPosition,int pDirection,int pPos) {
		super(pType,pCouleur,pPosition);
		direction=pDirection;
		pos=pPos;
	}
	//get
	public int getDirection() {
		return direction;
	}
	
	public int getPos() {
		return pos;
	}
	
	//set
	public void setPos(int pPos) {
		pos=pPos;
	}
	
	public void setDirection(int pDirection) {
		direction=pDirection;
	}
	
}