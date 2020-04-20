

import javax.swing.*;
import java.awt.*;

public abstract class Figures implements java.io.Serializable {
	private boolean estColorier; //boolean pour savoir si on colorie ou non la figure
	private boolean estAfficher; // permettra de savoir si une figure a deja ete afficher ou non
	private String nom;
	private int couleurf;

	// constructeur
	public Figures(String nom) {
		this.nom = nom;
	
	}

	public abstract void dessiner(Graphics g);

	public boolean getEstColorier() {
		return estColorier;
	}

	public void setEstColorier(boolean estColorier) {
		this.estColorier = estColorier;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String blaze) {
		this.nom = blaze;
	}

	public boolean getEstAfficher() {
		return estAfficher;
	}

	public void setEstAfficher(boolean estAfficher) {
		this.estAfficher = estAfficher;
	}
	public abstract int getCouleurf();
	
	public String toString() {
		return this.getNom();
	}
	

}
