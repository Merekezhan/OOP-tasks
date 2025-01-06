import java.util.Scanner;
public class task5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double myBalance = scanner.nextDouble();
		
		double procent = scanner.nextDouble();
		
		double procentpen = procent * 0.01 * myBalance;
		
		double newBalance = myBalance + procentpen;
		
		System.out.printf("Sizdin shotynyzda: "+ newBalance);
		
		scanner.close();

	}

}
