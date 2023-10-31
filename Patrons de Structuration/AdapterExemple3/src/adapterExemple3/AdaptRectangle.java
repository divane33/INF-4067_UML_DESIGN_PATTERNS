package adapterExemple3;

public class AdaptRectangle implements ICarre{
	
	Rectangle rectangle = new Rectangle();
	public static float cote;

	public float perimetre() {
		rectangle.setLongueur(cote);
		rectangle.setLargeur(cote);
		return rectangle.perimetre();
	}
	
	public float aire() {
		return rectangle.aire();
	}
	
}
