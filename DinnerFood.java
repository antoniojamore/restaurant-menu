public class DinnerFood extends Food {

	private int coursesRemaining;
	private boolean isFermented;
	private boolean lowSodium;

	public DinnerFood(String name, String description, double price, int calories, String freshOrFrozen, String culture, int coursesRemaining, boolean isFermented, boolean lowSodium) {
		super(name, description, price, calories, freshOrFrozen, culture);
		this.coursesRemaining = coursesRemaining;
		this.isFermented = isFermented;
		this.lowSodium = lowSodium;
	}

	public void nextCourse() {
		if(coursesRemaining > 1) {
			coursesRemaining--;
			System.out.println(" [!] You have been served your next course! (" + coursesRemaining + " courses remaining)");
		} else {
			System.out.println(" [!] There are no more courses in this dinner!");
		}
	}

	public void fermentIt() {
		if(isFermented) {
			System.out.println(" [!] This dinner is already fermented!");
		} else {
			isFermented = true;
			System.out.println(" [!] This dinner has been fermented.");
		}
	}

	public void addSodium() {
		if(lowSodium) {
			System.out.println(" [!] Sodium has been added to your dinner!");
			lowSodium = false;
		} else {
			System.out.println(" [!] You can't remove sodium from your dinner.");
		}
	}

	public String toString() {
		String result = super.toString();
		String fermentedStatement, sodiumStatement;
		if(isFermented)
			fermentedStatement = "is fermented";
		else
			fermentedStatement = "is not fermented";
		if(lowSodium)
			sodiumStatement = "is low on sodium";
		else
			sodiumStatement = "is not low on sodium";
		result += " * This meal has " + coursesRemaining + " courses remaining, " + fermentedStatement + ", and " + sodiumStatement + ".\n";
		return result;
	}

}