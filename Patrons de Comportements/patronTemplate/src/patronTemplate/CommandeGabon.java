package patronTemplate;

public class CommandeGabon extends Commande {
	
	float montantHt; float montantTva; float montantTtc; float montantPrestationHt; float montantMaterielHt;
	
	public CommandeGabon(double montantPrestationHt, double montantMaterielHt) {
		this.montantPrestationHt = (float) montantPrestationHt;
		this.montantMaterielHt = (float) montantMaterielHt;
		this.montantHt = (float) (montantPrestationHt + montantMaterielHt);
	}

	public void calculeTva() {
		this.montantTva = (float) (montantPrestationHt * 0.12 + montantMaterielHt * 0.15);
		// return montantTva;
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
