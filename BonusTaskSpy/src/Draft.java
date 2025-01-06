//
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class draft {
//    public static void main(String[] args) {
//        HashMap<String, Integer> People = new HashMap<>();
//        HashMap<String, Integer> HereAreSpies = new HashMap<>();
//        
//        Scanner scanner = new Scanner(System.in);
//        
//        for (int i = 0; i < 5; i++) {
//
//        	
//        	
//        	System.out.println("Enter name and key: ");
//        	String input = scanner.nextLine();
//        	String[] parts = input.split(" "); 
//            String name = parts[0]; 
//            Integer key = Integer.parseInt(parts[1]); 
//            
//            People.put(name, key); 
//        }
//        
//
//        for (String name : People.keySet()) {
//            int key = People.get(name);
//            int mainKey = key; 
//            
//            boolean isSpy = true; 
//            
//            if (key <= 0) {
//                isSpy = false; 
//            } else {
//                while (key > 1) {
//                    if (key % 2 != 0) {
//                        isSpy = false; 
//                        break;
//                    }
//                    key /= 2; 
//                }
//            }
//
//            if (isSpy) {
//                System.out.println(name + " is Spyyyyyyy!");
//                HereAreSpies.put(name, mainKey); 
//            }
//        }
//
//        
//        System.out.println("Spies are: ");
//        for (String name : HereAreSpies.keySet()) {
//            System.out.println(name + " has key: " + HereAreSpies.get(name)); 
//        }
//        
//        scanner.close(); 
//    }
//}
//
//
//HashMap<String, Person> people = new HashMap <>();
//Scanner scanner = new Scanner(System.in);
//int spyCount = 0;
//
//
//for(int i + 0; i < 5; i++) {
//	System.out.println("Enter name: ");
//	String name = scanner.nextLine();
//	int key = generateKey();
//	
//	
//	boolean isSpy = Detector.isSpy(key);
//	if(isSpy) {
//		spyCount++;
//		people.put(name, new Spy(name, key));
//		System.out.println(name + " with key " + key + " is a Spy!");
//	}
//	else {
//		people.put(name, new Person(name, key));
//		
//	}
//		
//}
//if(spyCount == 0) {
//	System.out.println("They are all spies!");
//	
//	for(String name: people.keySet()) {
//		int key = people.get(name).getKey();
//		people.put(name, new Spy(name, key));
//	}
//}
//
//System.out.println("/nList of people: ";)
//for(Person person : people.values()) {
//	System.out.println(person);
//	
//}
//scanner.close();
