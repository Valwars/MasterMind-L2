import java.awt.Color;
import java.util.Random;

public class Jeu {
	
	public static void main(String[] args ) {
		
		Color[] COULEURS = {Color.yellow, Color.GREEN, Color.blue, Color.MAGENTA,Color.RED, Color.orange, Color.WHITE, Color.black};
		Random rnd = new Random();

		
		Modèle mod = new Modèle();
		
		
		for(int j =0; j <10;j ++) {
			
			for(int i = 0; i< 4;i++) {
				
				mod.addPropositionColor(COULEURS[rnd.nextInt(COULEURS.length)]);
				
			}
		}
		
		
		
	
	}

}
