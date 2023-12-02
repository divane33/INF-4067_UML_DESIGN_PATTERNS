package patronDecorator;

public class DecorateurCurseurHorizontal extends DecorateurFenetre {

	public DecorateurCurseurHorizontal(Fenetre fenetre) {
		super(fenetre);
	}
	

	@Override
	 public String decrire() {
		 return super.decrire() + " avec ajustement de la barre Horizontale ";
	 }

}
