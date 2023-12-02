package patronDecorator;

public class Client {

	public static void main(String[] args) {

		 // Création de la fenêtre simple
		Fenetre fenetre = new FenetreSimple();
		
		// Ajustement de la barre Verticale
		Fenetre barreVertical = new DecorateurCurseurVertical(fenetre);
		
		// Ajustement de la barre Horizontale
		Fenetre barreHorizontal = new DecorateurCurseurHorizontal(fenetre);
		
		// Fenêtre simple avec barre vertcale
		System.out.println("\n"+barreVertical.decrire());
		
		// Fenêtre simple avec barre Horizontale
		System.out.println(barreHorizontal.decrire());
		
	}

}
