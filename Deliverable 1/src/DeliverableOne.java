import java.util.Scanner;

/**
 * DeliverableOne
 * 
 * @author Brendan
 */
public class DeliverableOne {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a 7-14 character password containing the following requirements:");
		System.out.println("One uppercase letter, one lowercase letter, and an exclamation(!) point.");
		
		String input = scanner.nextLine();
		
		//Minimum and maximum required password lengths
		int minLength = 7;
		int maxLength = 12;
		
		//Iterates through each character, checking if there's at least one uppercase or lowercase letter
		//This could also be done with regex but this is a little more readable
		boolean upperCase = input.chars().anyMatch(Character::isUpperCase);
		boolean lowerCase = input.chars().anyMatch(Character::isLowerCase);
		
		//Check if the password meets all of the requirements
		if (input.length() >= minLength && input.length() <= maxLength && input.contains("!") && 
				upperCase && lowerCase) {
			System.out.println("Password valid and accepted");
		} else {
			System.out.println("Error ");
		}
		
		scanner.close();
	}

}
