package patronDecorator;

public class FenetreSimple implements Fenetre{

	 @Override
	 public String dessiner() {
		 return "fen�tre rectangulaire";
	 }
	 
	 @Override
	 public String decrire() {
		 return "fen�tre rectangulaire de 12 pouces";
	 }
	
}
