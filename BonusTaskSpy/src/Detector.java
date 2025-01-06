//public class Detector extends Person {
//    public Detector(String name, int key) {
//		super(name, key);
//		// TODO Auto-generated constructor stub
//	}
//	public static boolean isSpy(int key) {
//        if (key <= 0) return false;
//        while (key > 1) {
//            if (key % 2 != 0) return false;
//            key /= 2;
//        }
//        return true;
//    }
//    
//    boolean isSpy = Detector.isSpy(key);
//    if (isSpy) {
//        spyCount++;
//        people.put(name, new Spy(name, key)); 
//        System.out.println(name + " with key " + key + " is a Spy!");
//    } else {
//        people.put(name, new Person(name, key)); 
//    }
//}