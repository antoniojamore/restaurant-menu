abstract public class Food extends MenuItem {

	private String freshOrFrozen;
	private boolean eaten;
	private String culture;

	public Food(String name, String description, double price, int calories, String freshOrFrozen, String culture) {
		super(name, description, price, calories);
		this.freshOrFrozen = freshOrFrozen;
		eaten = false;
		this.culture = culture;
	}
	
	public String isFreshOrFrozen() {
		return freshOrFrozen;
	}
	
	public void eat() {
		eaten = true;
		System.out.println(" [!] Your food has been eaten.");
	}

	public String getCulture() {
		return culture;
	}

	public String toString() {
		String result = " [" + culture + "]" + super.toString();
		if (eaten)
			result += " * This item has been eaten by the customer.\n";
		else
			result += " * This item is " + freshOrFrozen + " and has not been eaten yet.\n";
		return result;
	}


}