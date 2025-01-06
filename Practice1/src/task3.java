import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your score: ");
        double score = scanner.nextDouble();  
        
        String result = (score >= 95) ? "A": (score >= 90 )? "A-" :(score >= 85) ? "B" : (score > 80) ? "B-": (score >= 75) ? "C": (score >= 70)? "C-" : (score >= 65) ? "D": (score >= 60) ?"D-": "F" ;
        	System.out.println("Your grade: "+ result);
        
        scanner.close();
    }
}
