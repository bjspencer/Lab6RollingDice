import java.util.Scanner;

//importing Random class 
import java.util.Random;

public class DiceRolling {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String cont = "y";

		System.out.println("Welcome to Grand Circus Casino!");
		System.out.println();

		while (cont.equalsIgnoreCase("y")) {
			System.out.println("How many sides should each die have?");

			int numSides = scan.nextInt();
			scan.nextLine();

			System.out.println("Roll 1: ");
			
			// calling the method diceRoll twice, to generate two random numbers
			System.out.println(diceRoll(numSides));
			System.out.println(diceRoll(numSides));

			System.out.println();
			System.out.println("Roll again? (y/n)");
			cont = scan.next();
		}

		System.out.println("Thanks for playing!");

		scan.close();
	}

	// creating a method to generate random integers
	public static int diceRoll(int num) {
		Random roll = new Random();

		return 1 + (roll.nextInt(num));
	}
}
