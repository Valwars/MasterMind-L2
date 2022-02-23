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
	
	public int current_prop = 0;
	

	
	
	public  Modèle() {
		
		this.propositions = new Rangée[N_TENTATIVES];
		
		this.combinaison = new Rangée();
		
		Random rnd = new Random();
		
		for(int i = 0; i< DIFFICULTE;i++) {
			
			this.combinaison.addColor(COULEURS[rnd.nextInt(COULEURS.length)], i);
		}
		
		System.out.println(this.combinaison.toString());
		
		
	}
	
	public boolean verifyProposition() {
		
		boolean drap = true;
		
		for(int i = 0;i < DIFFICULTE; i ++) {
			
			if(!this.combinaison.testCouleur(prop.getIndexColor(i), i)) {
				drap = false;
			}
		}
		
		return drap;
		
	}
	
	public void addPropositionColor(Color c) {
		
		if(this.propositions[this.current_prop] == null) {
			
			this.propositions[this.current_prop] = new Rangée();
		}
		
		this.propositions[this.current_prop].addColor(c, this.current_prop);
		
		this.current_prop += 1;
		System.out.println( this.current_prop + " proposition");
		
		if(this.current_prop == 4) {
			this.current_prop = 0;
			System.out.println("Vous avez fait 4 prop, retour a une nouvelle tentative");
		}
		
	
		

		
		
		
	}
	
	


}
