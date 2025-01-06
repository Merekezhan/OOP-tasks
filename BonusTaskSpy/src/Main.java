//import java.util.HashMap;
//import java.util.Scanner;
//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        HashMap<String, Person> people = new HashMap<>();
//        Scanner scanner = new Scanner(System.in);
//        int spyCount = 0;
//
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Enter name: ");
//            String name = scanner.nextLine();
//            int key = generateKey(); 
//
//            boolean isSpy = Detector.isSpy(key);
//            if (isSpy) {
//                spyCount++;
//                people.put(name, new Spy(name, key)); 
//                System.out.println(name + " with key " + key + " is a Spy!");
//            } else {
//                people.put(name, new Person(name, key)); 
//            }
//        }
//
//        if (spyCount == 0) {
//            System.out.println("They are all spies!");
//         
//            for (String name : people.keySet()) {
//                int key = people.get(name).getKey(); 
//                people.put(name, new Spy(name, key)); 
//            }
//        }
//
//        
//        System.out.println("\nList of people:");
//        for (Person person : people.values()) {
//            System.out.println(person); 
//        }
//
//        scanner.close();
//    }
//
//   
//    public static int generateKey() {
//        Random random = new Random();
//        return random.nextInt(50) + 1;
//    }
//}
