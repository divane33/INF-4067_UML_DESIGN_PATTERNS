package patronAdapter;

public class DocumentPdf implements Document{
	
	ComposantPdf outilPdf = new ComposantPdf();
	

	public int setContenu(String contenu) {
		if(contenu == "pdf") {
			return outilPdf.pdfFixeContenu(contenu);
		}
		return 0;
	}
    public int dessine() {
    	return 2;
    }
    public int imprime() {
    	return 2;
    }
	
}
