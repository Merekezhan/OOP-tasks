
public class task1 {

	public static void main(String[] args) {
		String s = "mementomori";
		for(int i = 0; i < s.length() + 2; i++) {
			if(i == 0 || i == s.length() + 1) {
				System.out.print("+");
			}
			else {
				System.out.print("-");
			}
		}
		System.out.println();
		System.out.println("|" + s + "|");
		for(int i = 0; i < s.length() + 2; i++) {
			if(i == 0 || i == s.length() + 1) {
				System.out.print("+");
			}
			else {
				System.out.print("-");
			}
		}
		
	}

}
