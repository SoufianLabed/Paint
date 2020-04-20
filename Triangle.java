
import javax.swing.*;
import java.awt.*;

public class Triangle extends Figures {
	private int x;
	private int y;
	private int x2;
	private int y2;
	private int x3;
	private int y3;
	private int couleurf;
	private boolean estRemplie;
	
	//constructeur
	public Triangle(int x, int y, int x2, int y2,int x3, int y3, int couleurf,boolean estRemplie) {
		super("Triangle");
		this.x = x;
		this.y = y;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.couleurf = couleurf;
		this.estRemplie = estRemplie;
	}
	public Triangle() {
		super("Triangle");
	}
	
	//pour dessiner 
	public void dessiner(Graphics g){
		 int xpoints[] = {this.x,this.x2, this.x3};
	      int ypoints[] = {this.y,this.y2, this.y3};
	      if (this.estRemplie == false) {

	    	  g.drawPolygon(xpoints, ypoints, 3);
	      }
	      else {
	    	  g.fillPolygon(xpoints, ypoints, 3);
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
	
	
	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	
	public int getX3() {
		return x3;
	}

	public void setX3(int x3) {
		this.x3 = x3;
	}

	public int getY3() {
		return y3;
	}

	public void setY3(int y3) {
		this.y3 = y3;
	}

	public int getCouleurf() {
		return this.couleurf;
	}
	public boolean estRemplie() {
		return this.estRemplie;
	}

	
}