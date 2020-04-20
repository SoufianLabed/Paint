
import javax.swing.*;
import java.awt.*;

public class Polygone extends Figures {
	private int[] x;
	private int[] y;
	private int couleurf;
	private boolean estRemplie;
	private int Nbpoints;
	
	//constructeur
	public Polygone(int[] x, int[] y, int couleurf,boolean estRemplie,int Nbpoints) {
		super("Polygone");
		this.x = x;
		this.y =  y;

		this.couleurf = couleurf;
		this.estRemplie = estRemplie;
		this.Nbpoints = Nbpoints;
	}
	public Polygone() {
		super("Polygone");
	}
	
	//pour dessiner 
	public void dessiner(Graphics g){
		
	      
	      if (this.estRemplie == false) {

	    	  g.drawPolygon(this.x, this.y, this.Nbpoints);
	      }
	      else {
	    	  g.fillPolygon(this.x, this.y, this.Nbpoints);
	      }
	}
	
	// getters et setters

	public int[] getX() {
		return x;
	}

	public void setX(int[] x) {
		this.x = x;
	}

	public int[] getY() {
		return y;
	}

	public void setY(int[] y) {
		this.y = y;
	}
	
	

	

	public int getCouleurf() {
		return this.couleurf;
	}
	public boolean estRemplie() {
		return this.estRemplie;
	}
	
	public int getNbpoints(){
	return this.Nbpoints;
	}
	public void setNbpoints(int Nbpoints){
	 this.Nbpoints = Nbpoints;
	}

	
}
