import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        

        double d = b * b - 4 * a * c;
        
        if (d > 0) {
            double sqrtDiscriminant = Math.sqrt(d);
            double root1 = (-b + sqrtDiscriminant) / (2 * a);
            double root2 = (-b - sqrtDiscriminant) / (2 * a);
            System.out.printf("Root 1: ", root1);
            System.out.printf("Root 2: ", root2);
        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.printf("Root: ", root);
        } else {
            System.out.println("The equation has no real roots (discriminant is negative).");
        }


        scanner.close();
    }
}
