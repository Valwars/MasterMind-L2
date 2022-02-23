import java.awt.Color;
import java.util.Random;

public class Modèle {
	
	private Color[] COULEURS = {Color.yellow, Color.GREEN, Color.blue, Color.MAGENTA,Color.RED, Color.orange, Color.WHITE, Color.black};
	
	private static int N_TENTATIVES = 10;
	
	public static int DIFFICULTE = 4;
	
	enum Etat { EN_COURS, GAGNE , PERDU}
	
	public Etat état;
	
	public Rangée combinaison;
	
	public Rangée[] propositions;
	
	public int tentative;
	
	
	public  Modèle() {
		
		this.combinaison = new Rangée();
		
		Random rnd = new Random();
		
		for(int i = 0; i< DIFFICULTE;i++) {
			
			this.combinaison.addColor(COULEURS[rnd.nextInt(COULEURS.length)], i);
		}
		
		System.out.println(this.combinaison.toString());
		
		
		
	
	}


}
