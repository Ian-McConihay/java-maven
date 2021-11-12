import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;
public class Maven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useDelimiter("\n");
		System.out.println("Enter something: ");
		String input = scanner.next();
		System.out.println("Reverse input:" + StringUtils.reverse(input) + "\n");
		System.out.println("Your input with flipped case: " + StringUtils.swapCase(input) + "\n");
		System.out.println("Is your input a number: " + StringUtils.isNumeric(input) + "\n");
		System.out.println("Input length: " + StringUtils.length(input) + "\n");
		System.out.println("Contains whitespace: " + StringUtils.containsWhitespace(input) + "\n");





	}
}

