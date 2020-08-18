import java.util.Scanner;


public class Main {

	public static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		System.out.println("### WELCOME ###");
		
		ShowMenu();
	}

	private static void ShowMenu() {
		System.out.println("Choose an option:");
		System.out.println("1 - PalindromeCheck");
		System.out.println("2 - Quit");
		
		int selection = Integer.parseInt(sc.nextLine());
		
		switch(selection) {
			case 1:
				PalindromeCheck();
				break;
			case 2:
				sc.close();
				System.exit(0);
				break;
			default:
		}
	}
	
	private static void PalindromeCheck() {
		System.out.println("Enter word to check if it is a palindrome");
		String word = sc.nextLine();
		
		if(word.equals("")) {
			System.out.println("word is empty");
		}
		else {
			word = word.toLowerCase();
			boolean isPalindrome = word.equals(new StringBuilder(word).reverse().toString());
			
			if(isPalindrome) {
				System.out.println(word + " is a palindrome");
			}
			else {
				System.out.println(word + " is not a palindrome");
			}
		}
		ShowMenu();
	}
}
