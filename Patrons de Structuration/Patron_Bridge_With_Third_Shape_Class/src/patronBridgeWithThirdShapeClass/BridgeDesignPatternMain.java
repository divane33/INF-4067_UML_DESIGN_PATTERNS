package patronBridgeWithThirdShapeClass;

public class BridgeDesignPatternMain {

	public static void main(String[] args) {
		
		// Shape1: Rectangle rempli avec la couleur rouge
		Shape s1=new Rectangle(new RedColor());
		s1.colorIt();
		
		// Shape2: Cercle rempli avec la couleur bleu
		Shape s2=new Circle(new BlueColor());
		s2.colorIt();
		
		// Shape3: Triangle rempli avec la couleur noir
		Shape s3=new Triangle(new BlackColor());
		s3.colorIt();

	}

}
