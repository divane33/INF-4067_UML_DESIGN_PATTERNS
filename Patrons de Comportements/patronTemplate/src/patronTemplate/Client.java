package patronTemplate;

public class Client {

	public static void main(String[] args) {
		
		Commande commande;
		
		// Partie où on passe la commande au Cameroun
		System.out.println("\n Au Cameroun :");
		commande = new CommandeCameroun (1040.2);
		commande.calculeTva();
		commande.calculeMontantTtc();
		commande.affiche();
		
		// Partie où on passe la commande au Gabon
		System.out.println("\n Au Gabon :");
		commande = new CommandeGabon (1040.2, 780);
		commande.calculeTva();
		commande.calculeMontantTtc();
		commande.affiche();

	}

}
