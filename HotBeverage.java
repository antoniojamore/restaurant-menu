public class HotBeverage extends Beverage {

	private boolean isRich;
	private boolean hasWhippedCream;
	private boolean hasSugar;
	private double originalTemperature;

	public HotBeverage(String name, String description, double price, int calories, double temperature, boolean isRich, boolean hasWhippedCream, boolean hasSugar) {
		super(name, description, price, calories, temperature);
		this.isRich = isRich;
		this.hasWhippedCream = hasWhippedCream;
		this.hasSugar = hasSugar;
		originalTemperature = temperature;
	}
	
	public boolean isHot() {
		return (getTemperature() > 80);
	}
	
	public boolean isSpoiled() {
		return (getTemperature() < originalTemperature);
	}

	public void addRichness() {
		isRich = true;
		System.out.println(" [!] Your hot beverage has been given more rich flavor.");
	}

	public String toString() {
		String result = super.toString();
		String wcStatement, sugarStatement, richStatement;
		if(isRich)
			richStatement = "is rich in flavor";
		else
			richStatement = "is not rich in flavor";
		if(hasWhippedCream)
			wcStatement = "has whipped cream";
		else
			wcStatement = "does not have whipped cream";
		if(hasSugar)
			sugarStatement = "has sugar";
		else
			sugarStatement = "does not have sugar";
		result += " * This beverage " + wcStatement + ", " + sugarStatement + ", and " + richStatement + ".\n";
		return result;
	}


}