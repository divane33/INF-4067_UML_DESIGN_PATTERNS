package patronDecorator;

public class DecorateurCurseurVertical extends DecorateurFenetre {

	public DecorateurCurseurVertical(Fenetre fenetre) {
		super(fenetre);
	}
	

	@Override
	 public String decrire() {
		 return super.decrire() + " avec ajustement de la barre Verticale ";
	 }
}
