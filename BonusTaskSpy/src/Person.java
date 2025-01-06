import java.util.Random;
public class Person {
    protected String name;
    protected int key;

    public Person(String name, int key) {
        this.name = name;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public int getKey() {
        return key;
    }

    public static int generateKey() {
        Random random = new Random();
        return random.nextInt(50) + 1; 
    }
    
    
}