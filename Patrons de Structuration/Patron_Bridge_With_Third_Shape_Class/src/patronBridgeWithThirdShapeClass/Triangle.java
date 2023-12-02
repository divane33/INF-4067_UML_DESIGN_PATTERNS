package patronBridgeWithThirdShapeClass;

public class Triangle extends Shape {

    Triangle(Color color) {
	  super(color);
	}
    
	public void colorIt() {
		System.out.print("Triangle filled with ");
		color.fillColor();
	}
 
}
