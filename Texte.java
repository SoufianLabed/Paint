import javax.swing.*;
import java.awt.*;

public class Texte extends Figures {
	private String chaine; // pour dessiner des chaine de caractere
	private int x, y;
	private int couleurf;

	public Texte(String msg, int x, int y, int couleurf) {
		super("Texte");
		this.chaine = msg;
		this.x = x;
		this.y = y;
		this.couleurf = couleurf;
	}

	public void dessiner(Graphics g) {
		g.drawString(this.chaine, this.x, this.y);
	}
	public int getCouleurf() {
		return this.couleurf;
	}
}
