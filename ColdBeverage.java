public class ColdBeverage extends Beverage {

	private boolean isInfused;
	private boolean hasIce;
	private boolean hasLemon;
	private double originalTemperature;

	public ColdBeverage(String name, String description, double price, int calories, double temperature, boolean isInfused, boolean hasIce, boolean hasLemon) {
		super(name, description, price, calories, temperature);
		this.isInfused = isInfused;
		this.hasIce = hasIce;
		this.hasLemon = hasLemon;
		originalTemperature = temperature;
	}
	
	public boolean isCold() {
		return (getTemperature() < 60);
	}
	
	public boolean isSpoiled() {
		return (getTemperature() > originalTemperature);
	}

	public void infuseWater() {
		if(getName().equalsIgnoreCase("water")) {
			isInfused = true;
			System.out.println(" [!] Your water has been infused!");
		} else {
			System.out.println(" [!] You can only infuse water!");
		}
	}

	public String toString() {
		String result = super.toString();
		String iceStatement, lemonStatement, infusedStatement;
		if(isInfused)
			infusedStatement = "is infused";
		else
			infusedStatement = "is not infused";
		if(hasIce)
			iceStatement = "has ice";
		else
			iceStatement = "does not have ice";
		if(hasLemon)
			lemonStatement = "has lemon";
		else
			lemonStatement = "does not have lemon";
		result += " * This beverage " + iceStatement + ", " + lemonStatement + ", and " + infusedStatement + ".\n";
		return result;
	}


}