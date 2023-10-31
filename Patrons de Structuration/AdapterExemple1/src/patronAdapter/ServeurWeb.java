package patronAdapter;

public class ServeurWeb {
	
	public static void main(String[] args) {
    	
		int Html; int Pdf;

		DocumentHtml docHtml = new DocumentHtml();
		DocumentPdf docPdf = new DocumentPdf();
		
		// Impression d'un document html
		Html = docHtml.setContenu("html");
		System.out.println(Html);
		
		//Impression d'un document Pdf en utilisant l'adapteur
		Pdf = docPdf.setContenu("pdf");
		System.out.println(Pdf);
		
		/* Durant les diff�rents r�sultats, l'on devrait avoir 1 � l'�cran
		 * si le contenu � imprimer est un html, et 2 si le contenu � imprimer est un document pdf
		 * Au cas contraire, on aura z�ro qui serra retourn� si le contenu qui devrait 
		 * �tre entr� dans docHtml.setContenu serait diff�rent de 'html' et 
		 * si le contenu qui devrait �tre entr� dans docPdf.setContenu serait diff�rent de 'pdf' */
		
    }
	
}
