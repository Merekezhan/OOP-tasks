package task1;

public class Cat extends Animal implements CanHavePizza{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meows.");
    }

    @Override
    public void eatPizza() {
        System.out.println(getName() + " eats pizza.");
    }
}