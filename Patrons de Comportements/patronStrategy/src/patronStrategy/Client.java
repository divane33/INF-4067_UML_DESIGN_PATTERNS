package patronStrategy;

public class Client {

	public static void main(String[] args) {
		
		ImageStorage storeimage;
		
		// enregistrements d'une image png avec un contraste élevé et un contraste noir et blanc
		System.out.print("\n");
		storeimage = new ImageStorage("png", "high-contrast");
		storeimage.store("png");
		storeimage = new ImageStorage("png", "BnW");
		storeimage.store("png");
		
		
		// enregistrements d'une image jpeg avec un contraste élevé et un contraste noir et blanc
		System.out.print("\n");
		storeimage = new ImageStorage("jpeg", "high-contrast");
		storeimage.store("png");
		storeimage = new ImageStorage("jpeg", "BnW");
		storeimage.store("png");

	}

}
