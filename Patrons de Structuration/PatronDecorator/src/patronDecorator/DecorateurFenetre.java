package patronDecorator;

abstract class DecorateurFenetre implements Fenetre{

	 protected Fenetre fenetreDecoree;
	 
	 public DecorateurFenetre(Fenetre fenetre) {
		 this.fenetreDecoree = fenetre;
	 }
	 
	 @Override
	 public String dessiner() {
		 return fenetreDecoree.dessiner();
	 }
	 
	 @Override
	 public String decrire() {
		 return fenetreDecoree.decrire();
	 }
	
}
