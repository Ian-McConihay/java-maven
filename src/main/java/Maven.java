import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;
public class Maven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		StringUtils stringUtils = new StringUtils();
		System.out.println("Enter something: ");
		String input = scanner.next();

		System.out.println("Reverse input:" + StringUtils.reverse(input) + "\n");
		System.out.println("Your input with flipped case: " + StringUtils.swapCase(input) + "\n");
		System.out.println("Is your input a number: " + StringUtils.isNumeric(input));





	}
}

