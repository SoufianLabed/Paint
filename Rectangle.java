
import javax.swing.*;
import java.awt.*;

public class Rectangle extends Figures {
	private int x;
	private int y;
	private int longueur;
	private int largeur;
	private int couleurf;
	private boolean estRemplie;
	
	//constructeur
	public Rectangle(int x, int y, int longueur, int largeur,int couleurf , boolean estRemplie) {
		super("Rectangle");
		this.x = x;
		this.y = y;
		this.longueur = longueur;
		this.largeur = largeur;
		this.couleurf = couleurf;
		this.estRemplie = estRemplie;
		
	}
	public Rectangle() {
		super("Rectangle");
	}
	
	//pour dessiner 
	public void dessiner(Graphics g){
		if (this.estRemplie == false) {
		 g.drawRect(this.x, this.y, this.longueur, this.largeur);
		}
		else {
			 g.fillRect(this.x, this.y, this.longueur, this.largeur);
		}
	}
	
	// getters et setters

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	public int getCouleurf() {
		return this.couleurf;
	}
	public boolean estRemplie() {
		return this.estRemplie;
	}

}