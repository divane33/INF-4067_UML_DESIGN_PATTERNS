package patronDecorator;

public class Client {

	public static void main(String[] args) {

		 // Cr�ation de la fen�tre simple
		Fenetre fenetre = new FenetreSimple();
		
		// Ajustement de la barre Verticale
		Fenetre barreVertical = new DecorateurCurseurVertical(fenetre);
		
		// Ajustement de la barre Horizontale
		Fenetre barreHorizontal = new DecorateurCurseurHorizontal(fenetre);
		
		// Fen�tre simple avec barre vertcale
		System.out.println("\n"+barreVertical.decrire());
		
		// Fen�tre simple avec barre Horizontale
		System.out.println(barreHorizontal.decrire());
		
	}

}
