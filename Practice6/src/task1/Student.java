package task1;

public class Student extends Person implements CanHavePizza, CanHaveParty, CanHaveRetake, Moveable{
	public Student(String name, int age) {
		super(name, age);
		}

    public void dance() {
        System.out.println(getName() + " is dancing.");
    }

    public void move() {
        System.out.println(getName() + " is moving.");
    }

    public void eatPizza() {
        System.out.println(getName() + " eats pizza.");
    }

    public void takeRetake() {
        System.out.println(getName() + " is taking a retake exam.");
    }
}