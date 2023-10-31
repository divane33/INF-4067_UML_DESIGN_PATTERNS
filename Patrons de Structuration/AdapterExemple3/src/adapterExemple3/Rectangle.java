package adapterExemple3;

public class Rectangle {

	private float longueur;
	private float largeur;
	
//	public Rectangle(float longueur, float largeur) {
//		this.largeur = largeur;
//		this.longueur = longueur;
//	}
	
	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}
	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}
	
	public float perimetre() {
		return (this.longueur + this.largeur)*2;
	}
	
	public float aire() {
		return this.longueur * this.largeur;
	}
	
}
