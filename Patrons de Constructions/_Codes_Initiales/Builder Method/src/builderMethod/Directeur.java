package builderMethod;

public class Directeur {
	
	    private MonteurPizza monteurPizza;

	    public void setMonteurPizza(MonteurPizza typePizza) {
	        monteurPizza = typePizza;
	    }

	    public Pizza getPizza() {
	        return monteurPizza.getPizza();
	    }

	    public void construirePizza() {
	        monteurPizza.creerNouvellePizza();
	        monteurPizza.monterPate();
	        monteurPizza.monterSauce();
	        monteurPizza.monterGarniture();
	    }
	    
}
