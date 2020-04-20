

import javax.swing.*;
import java.awt.*;

public class trait extends Figures{
	private int x, y, x2, y2;
	private int couleurf;


	public trait(int x, int y, int x2, int y2,int couleurf) {
		super("trait");
		this.x = x;
		this.y = y;
		this.x2 = x2;
		this.y2 = y2;
		this.couleurf = couleurf;
	}
	public void dessiner (Graphics g) {
		g.drawLine(this.x, this.y, this.x2, this.y2);
	}
	public int getCouleurf() {
		return this.couleurf;
	}
}
