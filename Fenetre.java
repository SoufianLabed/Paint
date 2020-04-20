import java.awt.Dimension;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;

import java.awt.GradientPaint;

import java.awt.Graphics;

import java.awt.Graphics2D;

import java.awt.Image;

import java.awt.event.MouseEvent;

import java.awt.event.MouseListener;

import java.io.File;

import java.io.IOException;

import javax.imageio.ImageIO;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt .*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.SwingUtilities;
public class Fenetre extends JFrame implements ActionListener, java.io.Serializable{



  private Panneau pan = new Panneau();
  private Bouton Bcarre = new Bouton("Carre");
  private Bouton Btrait = new Bouton("Trait");
  private Bouton Bcercle = new Bouton("Cercle");
  private Bouton Btriangle = new Bouton("Triangle");
  private Bouton Btexte = new Bouton("Texte");
  private JPanel container = new JPanel();
  private JLabel label = new JLabel("Le JLabel");
  private Bouton Breset = new Bouton("Breset");
  private JLabel lab1 = new JLabel("Cercle");
  private JLabel labtriangle = new JLabel("Triangle");
  private JLabel labrectangle = new JLabel("Rectangle");
  private JPanel panBouton = new JPanel();
  private JLabel labsegment = new JLabel("Segment");
  private JButton Bvalide = new JButton("Valider");
  private JButton Bvalide2 = new JButton("Valider");
  private JButton Bvalide3 = new JButton("Valider");
  private JButton Bvalide4 = new JButton("Valider");
  private JButton Bvalide5 = new JButton("Valider");
  private JPanel panForme = new JPanel();
  private Box boxCercle = Box.createHorizontalBox(); //box pour la saisie pour le Cercle
  private Box boxSegment = Box.createHorizontalBox(); //box pour la saisie pour le Segment
  private Box boxCarre = Box.createHorizontalBox(); //box pour la saisie pour le Carre
  private Box boxTriangle = Box.createHorizontalBox(); //box pour la saisie pour le Triangle
  private Box boxTexte = Box.createHorizontalBox(); //box pour la saisie pour le Texte
  private Box saisie = Box.createVerticalBox();
  private Box bcouleur= Box.createVerticalBox(); //box pour la saisie pour le cercle
  private JButton bbleu = new JButton();
  private JButton bblanc = new JButton();
  private JButton brouge = new JButton();
  private JButton bvert = new JButton();
  private JPanel lasaisie = new JPanel();
  private String TouchePresse = "";
  private JButton sauver = new JButton("Sauver");
  private JButton charger = new JButton("Charger");
  
  
  JLabel touche = new JLabel("Ctrl + C,R,T");
  

  

    	JTextField fieldX = new JTextField("X1");
		JTextField fieldY = new JTextField("Y1");
		JTextField fieldLongueur = new JTextField("Longueur");
		JTextField fieldLargeur = new JTextField("Largeur");
		JTextField fieldX2 = new JTextField("X2");
		JTextField fieldY2 = new JTextField("Y2");
		JTextField fieldLongueur2 = new JTextField("Longueur");
		JTextField fieldLargeur2 = new JTextField("Largeur");
		JTextField fieldX3 = new JTextField("X3");
		JTextField fieldY3 = new JTextField("Y3");
		JTextField fieldLongueur3 = new JTextField("Longueur");
		JTextField fieldLargeur3 = new JTextField("Largeur");
		JTextField fieldX4 = new JTextField("X4");
		JTextField fieldY4 = new JTextField("Y4");
		JTextField fieldLongueur4 = new JTextField("Longueur");
		JTextField angle = new JTextField("Angle");
		JTextField fieldX5 = new JTextField("X5");
		JTextField fieldY5 = new JTextField("Y5");
		JTextField fieldX6 = new JTextField("X6");
		JTextField fieldY6 = new JTextField("Y6");
		JTextField chainetexte = new JTextField("Texte");
		
    //JTextField fieldCentre = new JTtextField("Centre cercle")

//Compteur de clics
  private int compteur = 0;


  public Fenetre() {
    this.setTitle("Paint");
    this.setSize(1000, 1000);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setContentPane(pan);
   // this.addKeyListener(new kListener());
    //this.setFocusable(true);
    this.addKeyListener(new kListener());
    this.addMouseListener(new sourisListener());
    brouge.setPreferredSize(new Dimension(300, 200));
    bbleu.setPreferredSize(new Dimension(300, 200));
    bblanc.setPreferredSize(new Dimension(300, 200));
    bvert.setPreferredSize(new Dimension(300, 200));
    brouge.setBackground(Color.red);
    bbleu.setBackground(Color.blue);
    bblanc.setBackground(Color.white);
    bvert.setBackground(Color.green);
   // pan.setFocusable(true);
    //KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
    //manager.addKeyEventDispatcher(new MyDispatcher());
    sauver.addActionListener(this);
    charger.addActionListener(this);
    sauver.addKeyListener(new kListener());
    charger.addKeyListener(new kListener());
    Bcarre.addActionListener(this);
    Bcercle.addActionListener(this);
    Btrait.addActionListener(this);
    Btriangle.addActionListener(this);
    Btexte.addActionListener(this);
    Breset.addActionListener(this);
    Bvalide.addActionListener(new actionvalide());
    Bvalide2.addActionListener(new actionvalide());
    Bvalide3.addActionListener(new actionvalide());
    Bvalide4.addActionListener(new actionvalide());
    Bvalide5.addActionListener(new actionvalide());
    brouge.addActionListener(new couleurlistener());
    bbleu.addActionListener(new couleurlistener());
    bblanc.addActionListener(new couleurlistener());
    bvert.addActionListener(new couleurlistener());
    
    Bcarre.addKeyListener(new kListener());
    Bcercle.addKeyListener(new kListener());
    Btrait.addKeyListener(new kListener());
    Btriangle.addKeyListener(new kListener());
    Btexte.addKeyListener(new kListener());
    Breset.addKeyListener(new kListener());
    Bvalide.addKeyListener(new kListener());
    Bvalide2.addKeyListener(new kListener());
    Bvalide3.addKeyListener(new kListener());
    Bvalide4.addKeyListener(new kListener());
    Bvalide5.addKeyListener(new kListener());
    brouge.addKeyListener(new kListener());
    bbleu.addKeyListener(new kListener());
    bblanc.addKeyListener(new kListener());
    bvert.addKeyListener(new kListener());
    
    
   

    Font police = new Font("Tahoma", Font.BOLD, 16);
    label.setFont(police);
    label.setForeground(Color.blue);
    label.setHorizontalAlignment(JLabel.CENTER);

    this.setLayout(new BorderLayout());
   
   
    this.bcouleur.add(brouge);
    this.bcouleur.add(bblanc);
    this.bcouleur.add(bvert);
    this.bcouleur.add(bbleu);
    this.add(bcouleur,BorderLayout.WEST);
    this.boxCercle.add(lab1);
    this.boxCercle.add(fieldX, BorderLayout.SOUTH);
    this.boxCercle.add(fieldY, BorderLayout.SOUTH);
    this.boxCercle.add(fieldLongueur, BorderLayout.SOUTH);
    this.boxCercle.add(fieldLargeur, BorderLayout.SOUTH);
    this.boxCercle.add(Bvalide, BorderLayout.SOUTH);



    saisie.add(boxCercle);
    this.add(this.lasaisie,BorderLayout.SOUTH);


    this.boxSegment.add(labsegment);
    this.boxSegment.add(fieldX2, BorderLayout.SOUTH);
    this.boxSegment.add(fieldY2, BorderLayout.SOUTH);
    this.boxSegment.add(fieldLongueur4, BorderLayout.SOUTH);
    this.boxSegment.add(angle, BorderLayout.SOUTH);
    this.boxSegment.add(Bvalide2, BorderLayout.SOUTH);

    
    this.boxCarre.add(labrectangle);
    this.boxCarre.add(fieldX3, BorderLayout.SOUTH);
    this.boxCarre.add(fieldY3, BorderLayout.SOUTH);
    this.boxCarre.add(fieldLongueur3, BorderLayout.SOUTH);
    this.boxCarre.add(fieldLargeur3, BorderLayout.SOUTH);
    this.boxCarre.add(Bvalide3, BorderLayout.SOUTH);
    
    
    this.boxTriangle.add(labtriangle);
    this.boxTriangle.add(fieldX4, BorderLayout.SOUTH);
    this.boxTriangle.add(fieldY4, BorderLayout.SOUTH);
    this.boxTriangle.add(fieldX5, BorderLayout.SOUTH);
    this.boxTriangle.add(fieldY5, BorderLayout.SOUTH); 
    this.boxTriangle.add(fieldX6, BorderLayout.SOUTH);
    this.boxTriangle.add(fieldY6, BorderLayout.SOUTH);
    this.boxTriangle.add(Bvalide4, BorderLayout.SOUTH);

    this.boxTexte.add(chainetexte,BorderLayout.SOUTH);
    this.boxTexte.add(Bvalide5,BorderLayout.SOUTH);
    
    saisie.add(boxCercle);
    this.add(this.lasaisie,BorderLayout.SOUTH);
    saisie.add(this.boxSegment);
    saisie.add(this.boxCarre);
    saisie.add(this.boxTriangle);
    saisie.add(this.boxTexte);
    this.lasaisie.add(saisie,BorderLayout.SOUTH);



    panForme.add(Bcarre);
    panForme.add(Btrait);
    panForme.add(Bcercle);
    panForme.add(Btriangle);
    panForme.add(Btexte);
    panForme.add(Breset);
    panForme.add(sauver);
    panForme.add(charger);
    panForme.add(touche,BorderLayout.WEST);
    
    pan.add(panForme,BorderLayout.NORTH);

    this.boxSegment.setVisible(false);
    this.boxCercle.setVisible(false);
    this.boxCarre.setVisible(false);
    this.boxTriangle.setVisible(false);
    this.boxTexte.setVisible(false);
  	
  	
  	
  	
    this.setFocusable(true);
   
    this.setVisible(true);
  }



	// Les différents champs de saisie des figures.
  public void affecteSaisieCercle() {
		this.pan.setx(Integer.parseInt(fieldX.getText()));
		this.pan.sety(Integer.parseInt(fieldY.getText()));
		this.pan.setLongueur(Integer.parseInt(fieldLongueur.getText()));
		this.pan.setLargeur(Integer.parseInt(fieldLargeur.getText()));
		pan.setDessin("Cercle");
		pan.repaint();

	}
  		public void affecteSaisieTrait() {
		this.pan.setx2(Integer.parseInt(fieldX2.getText()));
		this.pan.sety2(Integer.parseInt(fieldY2.getText()));
		this.pan.setLongueur4(Integer.parseInt(fieldLongueur4.getText()));
		this.pan.setAngle(Integer.parseInt(angle.getText()));
		pan.setDessin("Trait");
		pan.repaint();
	}

  		
  		
  		public void affecteSaisieCarre() {
  		this.pan.setx3(Integer.parseInt(fieldX3.getText()));
  		this.pan.sety3(Integer.parseInt(fieldY3.getText()));
  		this.pan.setLongueur3(Integer.parseInt(fieldLongueur3.getText()));
  		this.pan.setLargeur3(Integer.parseInt(fieldLargeur3.getText()));
  		pan.setDessin("Carre");
  		pan.repaint();
  		}
  		
  		public void affecteSaisieTriangle() {
  			this.pan.setx4(Integer.parseInt(fieldX4.getText()));
  	  		this.pan.sety4(Integer.parseInt(fieldY4.getText()));
  
  	  		this.pan.setx5(Integer.parseInt(fieldX5.getText()));
	  		this.pan.sety5(Integer.parseInt(fieldY5.getText()));
	  		
	  		this.pan.setx6(Integer.parseInt(fieldX6.getText()));
  	  		this.pan.sety6(Integer.parseInt(fieldY6.getText()));
  	  		
  	  		pan.setDessin("Triangle");
  	  		pan.repaint();
  	  		}

  		
  		public void affecteSaisieTexte() {
  			this.pan.setChaine(this.chainetexte.getText());
  	  		
  	  		pan.setDessin("Texte");
  	  		pan.repaint();
  	  		}

  		
		
  		
  		// action performed permettant de récupérer les valeurs des text fields.
  class actionvalide implements ActionListener {
	  public void actionPerformed (ActionEvent arg0) {
		  if(arg0.getSource().equals(Bvalide)){
			  affecteSaisieCercle();
		  }
		  if(arg0.getSource().equals(Bvalide2)){
			  affecteSaisieTrait();
		  }
		  if(arg0.getSource().equals(Bvalide3)){
			  affecteSaisieCarre();
		  }
		  if(arg0.getSource().equals(Bvalide4)){
			  affecteSaisieTriangle();
		  }
		  if(arg0.getSource().equals(Bvalide5)){
			  affecteSaisieTexte();
		  }
	  }
  }

	// ActionPerformed permettant d'afficher uniquement les fields dont on a besoin
	  public void actionPerformed (ActionEvent arg0){
    if(arg0.getSource().equals(Bcarre)){
    	this.boxSegment.setVisible(false);
    	this.boxCercle.setVisible(false);
    	this.boxCarre.setVisible(true);
    	this.boxTriangle.setVisible(false);
    	this.boxTexte.setVisible(false);
    	 
    }
    if(arg0.getSource().equals(Bcercle)){
      this.boxSegment.setVisible(false);
      this.boxCercle.setVisible(true);
      this.boxCarre.setVisible(false);
      this.boxTriangle.setVisible(false);
      this.boxTexte.setVisible(false);
    }
    if(arg0.getSource().equals(Btrait)){
      this.boxSegment.setVisible(true);
      this.boxCercle.setVisible(false);
      this.boxCarre.setVisible(false);
      this.boxTriangle.setVisible(false);
      this.boxTexte.setVisible(false);
    }
    if(arg0.getSource().equals(Btriangle)){
    	this.boxSegment.setVisible(false);
    	this.boxCercle.setVisible(false);
        this.boxCarre.setVisible(false);
        this.boxTriangle.setVisible(true);
        this.boxTexte.setVisible(false);
    }
    if(arg0.getSource().equals(Btexte)){
    	this.boxSegment.setVisible(false);
    	this.boxCercle.setVisible(false);
    	this.boxCarre.setVisible(false);
    	this.boxTriangle.setVisible(false);
    	this.boxTexte.setVisible(true);
    }
    if(arg0.getSource().equals(Breset)){
      pan.setDessin("Breset");
    }

    if(arg0.getSource().equals(sauver)){
        pan.sauver("Save.txt");
      }
    if(arg0.getSource().equals(charger)){
        pan.charger("Save.txt");
      }
    pan.repaint();
	  }
	  
	  class kListener implements KeyListener{

	  public void keyPressed(KeyEvent e) {
		 
			  if (e.getKeyCode()== 67) {
				  TouchePresse="c";
			  }
		    
		 
		    	if (e.getKeyCode()== 82) {
					  TouchePresse="r";
				  }
		    	if (e.getKeyCode()== 84) {
					  TouchePresse="t";
				  }
		    	if (e.getKeyCode()== 83) {
					  TouchePresse="s";
				  }
		    	if (e.getKeyCode()== 69) {
		    		
					  TouchePresse="e";
				  }
				 if (e.getKeyCode()== 80) {
		    		
					  TouchePresse="p";
				  }
				  if (e.getKeyCode()== 71) {
		    		
					  TouchePresse="g";
				  }
		    	if (e.getKeyCode()== 17) {
		    			if (pan.getRemplir() == false) {
		    				pan.setRemplir(true);
		    			}
		    			else {
		    				pan.setRemplir(false);
		    			}
					 
					  
				  }
		    if (e.getKeyCode()== 32) {
		    		
					  if (pan.getdessina() == "Poly") {
					  		System.out.println("Points");
					  		System.out.println(pan.getxpoints(2));
      						pan.setDessin("Polygone");
      						pan.repaint();
      						//pan.setNbpoints(0);
      						//pan.setxpoints(new int[5000]);
      						//pan.setypoints(new int[5000]);
				  }
		  
	    }
	    }
	  	
	    public void keyReleased(KeyEvent e) {
	        
	    }
	 
	    public void keyTyped(KeyEvent e) {
	        // on ne fait rien
	    }
	  }
	  
	  //Listener permettant de dessiner la forme choisi au clavier
	  class sourisListener implements MouseListener {
		  public void mouseClicked(MouseEvent e) {
			
		          // Clique gauche de la souris
		           if(e.getButton()==MouseEvent.BUTTON1)
		           {
		        	   if (TouchePresse == "c")
		        	   
		                pan.setx((int) e.getPoint().getX()-35);
		                pan.sety((int) e.getPoint().getY()-60);
		                pan.setLongueur(50);
		                pan.setLargeur(50);
		                pan.setDessin("Cercle");
		                pan.repaint();
		                
		            }
		           if (TouchePresse == "r") {
		        	  
		               
		                pan.setx3((int) e.getPoint().getX()-35);
		                pan.sety3((int) e.getPoint().getY()-60);
		                pan.setLongueur3(50);
		                pan.setLargeur3(50);
		                pan.setDessin("Carre");
		                pan.repaint(); }
		           if (TouchePresse == "t") {
			        	  
		               
		                pan.setx4((int) e.getPoint().getX()-50);
		                pan.sety4((int) e.getPoint().getY()-60);
		                pan.setx5((int) e.getPoint().getX()-10);
		                pan.sety5((int) e.getPoint().getY()-20);
		                pan.setx6((int) e.getPoint().getX()-80);
		                pan.sety6((int) e.getPoint().getY()-45);
		                pan.setDessin("Triangle");
		                pan.repaint(); }
		           
		           if (TouchePresse == "s") {
		   			
		   			pan.setx2((int) e.getPoint().getX()-50);
	                pan.sety2((int) e.getPoint().getY()-60);
	                pan.setLongueur4((int) e.getPoint().getX()-50);
	                pan.setAngle((int) e.getPoint().getY()-60);
	                pan.setDessin("Trait");
		   			pan.repaint();
		   			

		   		}

		   		  if (TouchePresse == "e") {
		   			
		   		
		   			pan.setx7((int) e.getPoint().getX()-50);
	                pan.sety7((int) e.getPoint().getY()-60);
		   			pan.setDessin("Texte");
		   			pan.repaint();
		   		}
		   		if (TouchePresse == "p") {
		   			
		   			
		   			pan.setxpoints(pan.getNbpoints(),(int) e.getPoint().getX());
		   			pan.setypoints(pan.getNbpoints(),(int) e.getPoint().getY());
		   			pan.setNbpoints(pan.getNbpoints() + 1);
		   			
		   			pan.setDessin("Poly");
		   			
		   			
		   			
		   		}
		   		
		           
		  }
			public void mousePressed(MouseEvent e) {
			}
			public void mouseReleased(MouseEvent e) {}
			//Invoked when a mouse button has been released on a component.

			public void mouseEntered(MouseEvent e) {}
			//Invoked when the mouse enters a component.

			public void mouseExited(MouseEvent e) {}
			//Invoked when the mouse exits a component.
		  	
		}
	  
	  // Listener permettant de changer la couleur
	  class couleurlistener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				if(e.getSource().equals(bbleu)){
					pan.setCouleur(3);
				  }
				if(e.getSource().equals(bblanc)){
					pan.setCouleur(4);
				  }
				if(e.getSource().equals(bvert)){
					pan.setCouleur(2);
				  }
				if(e.getSource().equals(brouge)){
					pan.setCouleur(1);
				  }
			}
		}


	  
		   
	
		
		 
	
		

  public static void main(String[] args) {
	    new Fenetre();
	    
	  }

}
