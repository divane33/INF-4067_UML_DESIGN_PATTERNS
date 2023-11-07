package patronComposite;

public class Client {

	public static void main(String[] args) {
		
		// element de type texte : c'est le fichier texte numéro 1
		FichierTXT fichierTexte1 = new FichierTXT("histoire sur L'Afrique");
	    System.out.println("\n"+fichierTexte1.decrire());
	    
	    // element de type PDF : c'est le fichier PDF numéro 1
	    FichierPDF fichierPDF1 = new FichierPDF("histoire sur L'Afrique (PDF)");
	    System.out.println(fichierPDF1.decrire());
	    
	    // element de type texte : c'est le fichier texte numéro 2
	    FichierTXT fichierTexte2 = new FichierTXT("histoire du Monde");
	    
	    // element de type PDF : c'est le fichier PDF numéro 2
	    FichierPDF fichierPDF2 = new FichierPDF("histoire sur les Hommes (PDF)");
	    
	    
	    /* On crée notre sous repertoire dans lequel on ajoute les fichiers texte numéro 1 et 2, puis
	     * les fichiers PDF numéro 1 et 2*/
	    SousRepertoire sousRepertoire1 = new SousRepertoire();
	    sousRepertoire1.add(fichierTexte1);
	    sousRepertoire1.add(fichierPDF1);
	    sousRepertoire1.add(fichierTexte2);
	    sousRepertoire1.add(fichierPDF2);
	    
	    sousRepertoire1.decrire();
	    
	    /* Ici on supprime fichierTexte2 du sousRepertoire1 et affiche de nouveau les elements de
	     *  sousRepertoire1 */
	    sousRepertoire1.remove(fichierTexte2);
	    sousRepertoire1.decrire();
	    
	}

}
