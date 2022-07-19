abstract public class Beverage extends MenuItem {

	private double temperature;
	private boolean thirsty;
	private int refills;

	public Beverage(String name, String description, double price, int calories, double temperature) {
		super(name, description, price, calories);
		this.temperature = temperature;
		thirsty = true;
		refills = 0;
	}
	
	public void quenchThirst() {
		thirsty = false;
		System.out.println(" [!] Your thirst has been quenched!");
	}
	
	public boolean isSpoiled() {
		return false;
	}

	public void refillDrink() {
		refills++;
		System.out.println(" [!] Your beverage has been refilled.");
	}

	public double getTemperature() {
		return temperature;
	}
	
	public void refridgerate() {
		updateTemperature(-10);
		System.out.println(" [!] Your beverage has been refridgerated.");
	}
	
	public void reheat() {
		updateTemperature(20);
		System.out.println(" [!] Your beverage has been reheated.");
	}

	public void updateTemperature(double temperature) {
		this.temperature += temperature;
	}

	public String toString() {
		String result = super.toString();
		if (isSpoiled())
			result += " * This beverage is spoiled.\n";
		else
			result += " * This beverage is not spoiled.\n";
		if (thirsty)
			result += " * The customer has had " + refills + " refill(s) but is thirsty.\n";
		else
			result += " * The customer has had " + refills + " refill(s) and is not thirsty.\n";
		return result;
	}


}