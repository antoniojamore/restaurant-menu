public class LunchFood extends Food {

	private boolean isGrilled;
	private String typeOfMeat;
	private boolean hasFries;

	public LunchFood(String name, String description, double price, int calories, String freshOrFrozen, String culture, boolean isGrilled, String typeOfMeat, boolean hasFries) {
		super(name, description, price, calories, freshOrFrozen, culture);
		this.isGrilled = isGrilled;
		this.typeOfMeat = typeOfMeat;
		this.hasFries = hasFries;
	}

	public boolean isGrilled() {
		return isGrilled;
	}

	public void addFries() {
		if(hasFries) {
			System.out.println(" [!] This lunch meal already has fries!");
		} else {
			hasFries = true;
			System.out.println(" [!] Fries have been added to this meal.");
		}
	}

	public String meatType() {
		return typeOfMeat;
	}

	public String toString() {
		String result = super.toString();
		String grilledStatement, friesStatement;
		if(isGrilled)
			grilledStatement = "is grilled";
		else
			grilledStatement = "is not grilled";
		if(hasFries)
			friesStatement = "has fries";
		else
			friesStatement = "does not have fries";
		result += " * This lunch contains " + typeOfMeat + " which " + grilledStatement + ", and " + friesStatement + ".\n";
		return result;
	}

}