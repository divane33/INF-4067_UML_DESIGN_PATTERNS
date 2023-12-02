package patronBridgeWithThirdColorClass;

public class BridgeDesignPatternMain {

	public static void main(String[] args) {
		
		// Shape s1 avec une couleur rouge
		Shape s1=new Rectangle(new RedColor());
		s1.colorIt();
		
		// Shape s2 avec une couleur bleu
		Shape s2=new Circle(new BlueColor());
		s2.colorIt();
		
		// Shape s1 avec une couleur noire
	    Shape s3=new Rectangle(new BlackColor());
		s3.colorIt();

	}

}
