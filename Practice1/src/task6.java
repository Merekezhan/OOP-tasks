import java.util.Scanner;
public class task6 {

	public static void main(String[] args) {
		/*Write a method that checks if an input string is a Palindrome. That is that it 
reads the same forward as backward like “racecar”*/
		
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		
		int j = word.length() - 1;
		boolean isPalindrome = true;
		for (int i = 0 ; i < word.length()/2 ; i++) {
			if(word.charAt(i) != word.charAt(j)) {
				isPalindrome = false;
				break;
			}
			else {
				isPalindrome = true;
			}
			j--;
		}
		if(isPalindrome) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}
		scan.close();
	}
	

}
