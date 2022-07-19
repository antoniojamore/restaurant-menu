public class Launcher {

	public static void main(String[] args) {

		MenuItem[] menu = new MenuItem[18];

		// String name, String description, double price, int calories, String freshOrFrozen, String culture, String breakfastType, boolean hasBacon
		menu[0] = new BreakfastFood("Scrambled Eggs", "A dish of eggs prepared by beating them with a little liquid and then cooking and stirring gently.", 7.68, 270, "fresh", "American", "English", true);
		menu[1] = new BreakfastFood("Pancakes", "A thin, flat cake of batter, usually fried and turned in a pan.", 2.56, 64, "frozen", "American", "American", false);
		menu[2] = new BreakfastFood("Cereal", "A traditional breakfast food made from processed cereal grains.", 1.58, 307, "fresh", "American", "traditional", false);
		menu[3] = new BreakfastFood("Oatmeal", "A breakfast food made from oats and liquid like water or milk.", 3.97, 158, "frozen", "American", "English", false);

		// String name, String description, double price, int calories, String freshOrFrozen, String culture, boolean isGrilled, String typeOfMeat, boolean hasFries
		menu[4] = new LunchFood("Grilled Chicken Salad", "A salad with grilled chicken as a main ingredient", 3.99, 265, "fresh", "American", true, "chicken", true);
		menu[5] = new LunchFood("Ham and Cheese Sandwich", "The bread may be fresh or toasted, and it can be made with a variety of toppings.", 6.95, 265, "fresh", "American", false, "ham and cheese", true);
		menu[6] = new LunchFood("Sushi", "A dish of prepared vinegared rice, accompanying a variety of ingredients, such as seafood and vegetables.", 13.68, 65, "fresh", "Japanese", false, "crab", false);

		// String name, String description, double price, int calories, String freshOrFrozen, String culture, int coursesRemaining, boolean isFermented, boolean lowSodium
		menu[7] = new DinnerFood("Chicken Parm", "A dish that consists of breaded chicken breast covered in tomato sauce and cheese.", 12.57, 567, "fresh", "Italian", 3, false, false);
		menu[8] = new DinnerFood("Spaghetti and Meatballs", "An Italian-American dish consisting of spaghetti, tomato sauce and meatballs.", 12.91, 400, "Fresh", "Italian", 4, false, false);
		menu[9] = new DinnerFood("Cheeseburger", "A hamburger topped with cheese. Traditionally, the slice of cheese is placed on top of the meat patty.", 2.79, 303, "fresh", "American", 2, false, false);
		menu[10] = new DinnerFood("Mac and Cheese", "A dish of cooked macaroni pasta and a cheese sauce, most commonly cheddar.", 4.53, 310, "frozen", "American", 1, false, true);

		// String name, String description, double price, int calories, double temperature, boolean isInfused, boolean hasIce, boolean hasLemon
		menu[11] = new ColdBeverage("Water", "An inorganic, transparent, tasteless, odorless, and nearly colorless chemical substance.", 1.23, 0, 50, false, false, false);
		menu[12] = new ColdBeverage("Milk", "A nutrient-rich liquid food produced by the mammary glands of mammals.", 1.51, 103, 35, false, false, false);
		menu[13] = new ColdBeverage("Soft Drink", "A drink that usually contains water, a sweetener, and a natural and/or artificial flavoring.", 2.55, 140, 40, false, true, true);
		menu[14] = new ColdBeverage("Juice", "A drink made from the extraction or pressing of the natural liquid contained in fruit and vegetables.", 3.12, 136, 35, false, false, false);

		// String name, String description, double price, int calories, double temperature, boolean isRich, boolean hasWhippedCream, boolean hasSugar
		menu[15] = new HotBeverage("Coffee", "A brewed drink prepared from roasted coffee beans, the seeds of berries from certain Coffea species.", 2.99, 1, 140, true, false, true);
		menu[16] = new HotBeverage("Hot Chocolate", "A heated drink consisting of chocolate or cocoa powder, heated milk or water, and usually a sweetener.", 2.89, 194, 120, true, true, true);
		menu[17] = new HotBeverage("Tea", "An aromatic beverage prepared by pouring hot or boiling water over cured or fresh leaves of Camellia sinensis.", 2.97, 2, 130, false, false, true);

		System.out.println("----------------------------------------------------------------------------------------------------------------------");

		for (int id = 0; id < menu.length; id++) {

			System.out.println("");
			System.out.print(menu[id]);
			System.out.println("");
			System.out.println(" > [Order ID: " + (id + 1)+ "]");
			System.out.println("");
			System.out.println("----------------------------------------------------------------------------------------------------------------------");

		}

	}

}