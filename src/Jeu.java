import java.awt.Color;

public class Jeu {
	
	public static void main(String[] args ) {
		Modèle mod = new Modèle();
		
		mod.addPropositionColor(Color.GREEN);
		mod.addPropositionColor(Color.RED);
		mod.addPropositionColor(Color.WHITE);
		mod.addPropositionColor(Color.YELLOW);
		
		System.out.println("" + mod.verifyProposition());
	}

}
