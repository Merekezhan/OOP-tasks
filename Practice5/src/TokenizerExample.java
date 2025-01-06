import java.util.StringTokenizer;

public class TokenizerExample {
    public static void main(String[] args) {
        String str = "Burger,Pizza,Apple"; 
        StringTokenizer tokenizer = new StringTokenizer(str, ",", true);
        
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}