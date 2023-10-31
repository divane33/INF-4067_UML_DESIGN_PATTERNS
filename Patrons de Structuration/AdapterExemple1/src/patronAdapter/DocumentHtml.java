package patronAdapter;

public class DocumentHtml implements Document{

	public int setContenu(String contenu) {
		if(contenu == "html") {
			return 1;
		}
		return 0;
	}
    public int dessine() {
    	return 1;
    }
    public int imprime() {
    	return 1;
    }
	
}
