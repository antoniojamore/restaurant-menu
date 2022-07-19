abstract public class MenuItem {

	private String name;
	private String description;
	private double price;
	private int calories;

	public MenuItem(String name, String description, double price, int calories) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.calories = calories;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public int getCalories() {
		return calories;
	}

	public String toString() {
		String result = " \"" + name + "\" $" + price + "\n";
		result += " " + description + " (" + calories + " cal)\n\n";
		return result;
	}

}