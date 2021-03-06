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
		this.état = Etat.EN_COURS;
		
		this.propositions = new Rangée[N_TENTATIVES];
		
		this.combinaison = new Rangée();
		
		Random rnd = new Random();
		
		for(int i = 0; i< DIFFICULTE;i++) {
			
			this.combinaison.addColor(COULEURS[rnd.nextInt(COULEURS.length)], i);
		}
		
		System.out.println("COMBINAISON A TROUVER : \n" +this.combinaison.toString());
		
		
	}
	
	public boolean verifyProposition() {
		
		boolean drap = true;
		
		for(int i = 0;i < DIFFICULTE; i ++) {
			
			if(!this.combinaison.testCouleur(propositions[tentative].getIndexColor(i), i)) {
				drap = false;
			}
		}
		
		if(drap) {
			this.état = Etat.GAGNE;
			System.out.println("VOUS AVEZ GAGNEZ");
		}else if((tentative +1 ) == N_TENTATIVES) {
			this.état = Etat.PERDU;
			
		}
		
		return drap;
		
	}
	
	public void addPropositionColor(Color c) {
		
		if(this.propositions[tentative] == null) {
			
			this.propositions[tentative] = new Rangée();
		}
		
		this.propositions[tentative].addColor(c, this.current_prop);
		
		
		this.current_prop += 1;
	
		
		if(this.current_prop == 4) {
		
			System.out.println("Votre proposition est : "+this.verifyProposition());
	
			System.out.println("Vous avez fait 4 prop, pour la tentative : "+ (this.tentative +1) + "/"+N_TENTATIVES +" nouvelle tentative...");
			this.tentative += 1;
			if(this.état ==  Etat.PERDU) {
				System.out.println("Vous avez perdu la partie");
				
			}else if(this.état ==  Etat.GAGNE){
				System.out.println("Vous avez perdu la partie");
				System.exit(0);

			}
			
			this.current_prop = 0;
		
			
		}
			
	}
	

	
}
