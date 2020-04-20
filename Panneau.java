import java.awt.Color;
import java.util.ArrayList;
import java.awt.Graphics;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JPanel;

public class Panneau extends JPanel implements java.io.Serializable{


  private int x,y;
  private int longueur, largeur;
  private int x2,y2;
  private int longueur2, largeur2;
  private int x3,y3;
  private int longueur3, largeur3;
  private int x4,y4;
  private int longueur4, largeur4;
  private int x5,y5;
  private int x6,y6;
  private int x7,y7;
  private int angle;
  private int posX = 50;
  private int posY = 50;
  private String dessina = "";
  private int couleur = 1; // connaitre la couleur 
  private boolean remplir = false;
  private String chaine ="";
  private Graphics g;
  private int[] xpoints = new int[5000];
  private int[] ypoints = new int[5000];
  private int Nbpoints = 0;
  ArrayList<Figures> figureCree = new ArrayList<Figures>(); //list ou on va mettre les forme creer au cours dun dessin
  ArrayList<String> figureCreeCouleur= new ArrayList<String>(); //list ou on va mettre les forme creer au cours dun dessin
  String fichier = "Save.txt";
  ArrayList<Figures> figureCree2 = new ArrayList<Figures>(); //list ou on va mettre les forme creer au cours dun dessin
  public void paintComponent(Graphics g) {
    System.out.println("Component");
    redessine(g);

    
    if(couleur==3) {
		g.setColor(Color.blue);
	}
	if(couleur==4) {
		g.setColor(Color.white);
	}
	if(couleur==2) {
		g.setColor(Color.green);
	}
	if(couleur==1) {
		g.setColor(Color.red);
	}
    if (dessina == "Carre") {
    	Rectangle rectangle = new Rectangle(this.x3,this.y3,this.longueur3,this.largeur3,this.couleur,this.remplir);
        figureCree.add(rectangle);
        rectangle.dessiner(g);
      

    }
    if (dessina == "Trait") {
    	
        trait trait = new trait(this.x2,this.y2,this.longueur4,this.angle,this.couleur);
        figureCree.add(trait);
        trait.dessiner(g);
       
    }

    if (dessina == "Cercle") {
      Cercle cercle = new Cercle(this.x,this.y,this.longueur,this.largeur,this.couleur,this.remplir);
      figureCree.add(cercle);
      cercle.dessiner(g);
      
      System.out.println(figureCree.toString());

    }

    if (dessina == "Triangle") {
    	
    	Triangle triangle = new Triangle(this.x4,this.y4,this.x5,this.y5,this.x6,this.y6,this.couleur,this.remplir);
        figureCree.add(triangle);
        triangle.dessiner(g);
        
    }
    if (dessina == "Texte") {
    	Texte texte = new Texte(this.chaine,this.x7,this.y7,this.couleur);
    	
        figureCree.add(texte);
        texte.dessiner(g);
      

    }
   
    
    if (dessina =="Polygone") {
    
    	Polygone polygone = new Polygone(xpoints, ypoints,this.couleur,this.remplir,this.Nbpoints) ;
		figureCree.add(polygone);
      	polygone.dessiner(g);
      	Nbpoints = 0;
      	xpoints= new int[5000];
      	ypoints =new int[5000];
    }

    if (dessina == "Breset") {
    	g.setColor(Color.white);
    	g.fillRect(0, 0, this.getWidth(), this.getHeight());
    	this.figureCree.clear();
    
		System.out.println(figureCree.toString()+"Larraylist");
    }

    
    
  }
  
  
  private void redessine(Graphics g) {
		//on verifie que la list est pas vide, cest a dire quon a bien dessiner heja avant
	  
	
		if(this.figureCree.size() != 0 ) {
			
			for(Figures figure : this.figureCree) {
				//on parcour et redessine chaque figure stockee dans la list
				if (figure.getCouleurf() == 1){
					g.setColor(Color.red);
				
					}
				if ( figure.getCouleurf() == 2){
					g.setColor(Color.green);
					
					}
				if (figure.getCouleurf() == 3){
					g.setColor(Color.blue);
					
					}
				if (figure.getCouleurf() == 4){
					g.setColor(Color.white);
					
					}
				
				System.out.println(figure.getCouleurf());
				System.out.println(couleur+"La couleur");
				figure.dessiner(g);
				
			}
			 
		}

	}

  public void sauver(String fichier) {
		try {

		    FileOutputStream fos = new FileOutputStream(fichier);
		    ObjectOutputStream oos = new ObjectOutputStream(fos);
		    oos.writeObject(this.figureCree);
//		    oos.writeObject(this.figureCreeCouleur);
	//	    oos.writeObject(this.figureCreeRemplie);
		    
		    oos.flush();
		    oos.close();

		}

		    catch (java.io.IOException exept) {
		    exept.printStackTrace();

		}
	}
	
	
	public void charger(String fichier) {
		//ArrayList<Figures> figureCharger ;
		try {
			FileInputStream fis = new FileInputStream( fichier );
			ObjectInputStream ois = new ObjectInputStream(fis);
			this.figureCree = (ArrayList<Figures> ) ois.readObject();
//			this.figureCreeCouleur = (ArrayList<String> ) ois.readObject();
	//		this.figureCreeRemplie = (ArrayList<Boolean> ) ois.readObject();
			ois.close();
			
			//this.add(this.figureCree ,BorderLayout.CENTER);
			//this.setPanDessin(panDessinCharger);
			
			this.repaint();
		}
		
		
		catch (java.io.IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		repaint();
	}
    public int getx() {
      return x;
    }

    public void setx(int x) {
      this.x = x;
    }

    public int gety() {
      return y;
    }

  	public float getLargeur() {
  		return largeur;
  	}



  	public void setLargeur(int largeur) {
  		this.largeur = largeur;
  	}

  	public float getLongueur() {
  		return longueur;
  	}


  	public void setLongueur(int longueur) {
  		this.longueur = longueur;
  		
  	}
  	
  	 public void sety(int y) {
         this.y = y;
       }

    public void setDessin(String dessin) {
      this.dessina = dessin;
    }

    public void sety2(int y) {
      this.y2 = y;
    }
    public int getx2() {
        return x2;
      }

    public void setx2(int x) {
        this.x2 = x;
      }

    public int gety2() {
        return y2;
      }

    public float getLargeur2() {
    		return largeur2;
    	}



    public void setLargeur2(int largeur) {
    		this.largeur2 = largeur;
    	}

    public float getLongueur2() {
    		return longueur2;
    	}


    public void setLongueur2(int longueur) {
    		this.longueur2 = longueur;
    	}

    
    public void sety3(int y) {
    	      this.y3 = y;
    	    }
    public int getx3() {
    	        return x3;
    	      }

    public void setx3(int x) {
    	        this.x3 = x;
    	      }

    public int gety3() {
    	        return y3;
    	      }

    public float getLargeur3() {
    	    		return largeur3;
    	    	}



    public void setLargeur3(int largeur) {
    	    		this.largeur3 = largeur;
    	    	}

    public float getLongueur3() {
    	    		return longueur3;
    	    	}


    public void setLongueur3(int longueur) {
    	    		this.longueur3 = longueur;
    	    	}

    
    
    public void sety4(int y) {
	      this.y4 = y;
	    }
    public int getx4() {
	        return x4;
	      }

    public void setx4(int x) {
	        this.x4 = x;
	      }

    public int gety4() {
	        return y4;
	      }

    public float getLargeur4() {
	    		return largeur4;
	    	}



    public void setLargeur4(int largeur) {
	    		this.largeur4 = largeur;
	    	}

    public float getLongueur4() {
	    		return longueur4;
	    	}


    public void setLongueur4(int longueur) {
	    		this.longueur4 = longueur;
	    	}
    
    public void setAngle(int angle) {
		this.angle = angle;
	}
    
    
    public void sety5(int y) {
	      this.y5 = y;
	    }
  public int getx5() {
	        return x5;
	      }

  public void setx5(int x) {
	        this.x5 = x;
	      }

  public int gety5() {
	        return y5;
	      }




  
  
  public void sety6(int y) {
      this.y6 = y;
    }
  public int getx6() {
        return x6;
      }

	public void setx6(int x) {
        this.x6 = x;
      }

	public int gety6() {
        return y6;
      }

	
	 public void sety7(int y) {
	      this.y7 = y;
	    }
	  public int getx7() {
	        return x7;
	      }

		public void setx7(int x) {
	        this.x7 = x;
	      }

		public int gety7() {
	        return y7;
	      }

	public int getCouleur() {
		return this.couleur;
	}
  
    public void setCouleur(int lacouleur) {
		this.couleur = lacouleur;
	}
    public boolean getRemplir() {
    	return this.remplir;
    }
    public void setRemplir(boolean remplir) {
    	this.remplir = remplir;
    }
    public String getChaine() {
    	return this.chaine;
    }
    public void setChaine(String chaine2) {
    	this.chaine = chaine2;
    }
    public String getdessina() {
    	return this.dessina; 
    }
    
    public void setxpoints(int i ,int valeur) {
		this.xpoints[i] = valeur;
	}
	public void setypoints(int i ,int valeur){
		this.ypoints[i] = valeur;
	}
  	public void setxpoints(int[] tableau) {
		this.xpoints =  tableau;
	}
	public void setypoints(int[] tableau){
		this.ypoints = tableau;
	}
    public int getNbpoints() {
		return this.Nbpoints;
		
	}
	public int getxpoints(int valeur) {
		return this.xpoints[valeur];
		
	}
	public void setNbpoints(int valeur){
		this.Nbpoints = valeur;
		
	}
}
