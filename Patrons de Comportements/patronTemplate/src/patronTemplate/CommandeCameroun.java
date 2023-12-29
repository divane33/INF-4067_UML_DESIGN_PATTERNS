package patronTemplate;

public class CommandeCameroun extends Commande {
	
	public float montantHt; 
	protected float montantTva; 
	public float montantTtc;
	
	public CommandeCameroun(double d) {
		this.montantHt = (float) d;
	}

	public void calculeTva() {
		this.montantTva = (float) (montantHt * 0.196);
		//return montantTva;
	}

	@Override
	public void calculeMontantTtc() {
		calculeTva();
		this.montantTtc = (float) (montantHt + montantTva);
		// return montantTva;
	}
	
	@Override
	public void affiche() {
		System.out.println(" La Tva est de "+ montantTva);
		System.out.println(" Le montantTtc est de "+ montantTtc);
	}
	

}
