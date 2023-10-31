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
		
		/* Durant les différents résultats, l'on devrait avoir 1 à l'écran
		 * si le contenu à imprimer est un html, et 2 si le contenu à imprimer est un document pdf
		 * Au cas contraire, on aura zéro qui serra retourné si le contenu qui devrait 
		 * être entré dans docHtml.setContenu serait différent de 'html' et 
		 * si le contenu qui devrait être entré dans docPdf.setContenu serait différent de 'pdf' */
		
    }
	
}
