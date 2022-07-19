public class BreakfastFood extends Food {

	private String breakfastType;
	private boolean hasBacon;
	private boolean isBurnt;

	public BreakfastFood(String name, String description, double price, int calories, String freshOrFrozen, String culture, String breakfastType, boolean hasBacon) {
		super(name, description, price, calories, freshOrFrozen, culture);
		this.breakfastType = breakfastType;
		this.hasBacon = hasBacon;
		isBurnt = false;
	}
	
	public String getBreakfastType() {
		return breakfastType;
	}
	
	public void addBacon() {
		hasBacon = true;
		System.out.println(" [!] Bacon has been added to your breakfast item!");
	}

	public void burnIt() {
		isBurnt = true;
		System.out.println(" [!] Your breakfast has been burnt. :(");
	}

	public String toString() {
		String result = super.toString();
		String baconStatement;
		if (hasBacon)
			baconStatement = "has bacon";
		else 
			baconStatement = "does not have bacon";
		if (isBurnt)
			result += " * This " + breakfastType + " style breakfast item " + baconStatement + " and is burnt.\n";
		else
			result += " * This " + breakfastType + " style breakfast item " + baconStatement + ".\n";
		return result;
	}


}