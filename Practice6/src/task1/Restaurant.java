package task1;

public class Restaurant {
	boolean servePizza(CanHavePizza eater) {
		eater.eatPizza();
		if (eater instanceof Person) {
			System.out.println(((Person) eater).getName() + " pays for the pizza.");
		}
		return true;
	}
}