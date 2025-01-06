public class Spy extends Person {
    public Spy(String name, int key) {
        super(name, key);
    }

    @Override
    public String toString() {
        return name + " with key " + key + " is a Spy!";
    }

	
}