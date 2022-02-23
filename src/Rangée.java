import java.awt.Color;
import java.util.Random;

public class Rangée {
	
	public Color[] jetons = new Color[Modèle.DIFFICULTE];
	
	public int indiceJeton = 0;
	
	public int noir;
	
	public int blanc;
	
	
	public Rangée() {
		
	}
	
	public void addColor(Color c,int i) {
		jetons[i] = c;
	}
	
	public String toString() {
		String ch ="";
		
		
		for(int i =0;i < jetons.length;i++) {
			ch += jetons[i] +"\n";
		}
		
		return ch;
	}
	
	public boolean testCouleur(Color c, int i) {
		
		return jetons[i] == c;
	}
	
	public Color getIndexColor(int i) {
		return jetons[i];
	}
	
}
