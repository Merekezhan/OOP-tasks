package task1;

public class Main {
	public static void main(String[] args) {
		Restaurant delpapa = new Restaurant();
		
		Cat cat1 = new Cat("Kitty", 3);
		Student student1 = new Student("Mereke", 18);
		Student student2 = new Student("Magzhan", 21);
		
		delpapa.servePizza(cat1);
		delpapa.servePizza(student1);
		
		student1.dance();
		student2.move();
		student2.takeRetake();
	}
}