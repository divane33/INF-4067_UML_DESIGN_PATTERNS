package patronTemplate;

public abstract class Commande {

	protected float montantHt;
	protected float montantTva;
	protected float montantTtc;
	
	
	protected abstract void calculeTva();
	
	public abstract void calculeMontantTtc();
	
	public void affiche() {
			
	}
	
	
}
