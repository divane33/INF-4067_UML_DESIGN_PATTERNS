package adapterExemple3;

public class Programme {

	public static void main(String[] args) {
		
		float perimetre;
		float aire;
		
		ICarre carre;
		carre = new AdaptRectangle();
		
		AdaptRectangle.cote = 3;
		
		perimetre = carre.perimetre();
		System.out.println("Le p�rim�tre est de "+perimetre);
		
		aire = carre.aire();
		System.out.println("L'aire est de "+aire);
		
	}
	
}
