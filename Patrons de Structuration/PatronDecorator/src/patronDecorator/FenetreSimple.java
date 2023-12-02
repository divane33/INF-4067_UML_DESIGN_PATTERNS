package patronDecorator;

public class FenetreSimple implements Fenetre{

	 @Override
	 public String dessiner() {
		 return "fenêtre rectangulaire";
	 }
	 
	 @Override
	 public String decrire() {
		 return "fenêtre rectangulaire de 12 pouces";
	 }
	
}
