package patronComposite;

import java.util.ArrayList;

public class SousRepertoire implements Repertoire {
	
	  ArrayList<Repertoire> Children;
	
	  public SousRepertoire() {
		  Children = new ArrayList<Repertoire>();	  
	  }
	  
	  public void add(Repertoire repertoire) {
		     Children.add(repertoire);
	   } 
	  
	  public void remove(Repertoire repertoire) {
		     Children.remove(repertoire);
	   } 
	
	  @Override
	   public String decrire() {
		  
		  System.out.println("\n");
		   
		   for(Repertoire child : Children) {
			   if(child != null) {
				  System.out.println(child.decrire());
			   }
		   }
		   
		   return "";
	   }
}








