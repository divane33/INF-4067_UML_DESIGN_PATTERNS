package builderMethod;

public class MonteurPizzaPiquante extends MonteurPizza {

	public void monterPate() { 
		  pizza.setPate("feuillet�e");
	}
	
	public void monterSauce() { 
		  pizza.setSauce("piquante"); 
	}
	
	public void monterGarniture() { 
		  pizza.setGarniture("pepperoni+salami");
	}
	
}
