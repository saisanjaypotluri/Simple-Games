import java.util.Scanner;
//importing necessary files from above library to take input from keyboard
public class GuessingGameSanjay
{
	public static int guess(int randomnumber, int number)
	{
		if (number == randomnumber)
		{
			System.out.println("That's Correct! Congratulations!");
			return 0;
			//this statement is printed if the number are exactly matched
		}
		else if (number > randomnumber)
		{
			System.out.println("Too high!");
			//Too high is printed if the guessed number is greater than the random number
		}
		else if (number < randomnumber)
		{
			System.out.println("Too low!");
			//Too high is printed if the random number is greater than the guessed number
		}
		return 1;
	}
	public static void main(String[] args) 
	{
		int randomnumber = (int)(Math.random() * 10);
		//using Math.random() to generate random numbers and multiply with 10 so that the number always lie within 0 to 10
		Scanner input = new Scanner(System.in);
		//Use scanner method to take input from user by keyboard
		System.out.println("Welcome to the game of Guess It!");
		System.out.println("I will choose a number between 0 and 9.");
		System.out.println("You will try to guess that number. If your guess is wrong, I will tell you if you guessed too high or too low.");
		System.out.println("You have 3 tries to guess the number.");
		System.out.println("OK, I am thinking of a number. Try to guess");
		int number;
		int i = 0;
		do{
			System.out.print("Your guess? ");
			//Prints instructions about how to play the game
			number = input.nextInt();
			//User enters a number which is compared with the generated random number
			i++;

		}while(i < 3 && guess(randomnumber, number) != 0);
		if (guess(randomnumber, number) == 1)
		{
			System.out.println("Sorry, my number is " + randomnumber);
		}
		System.out.println("Thanks for playing!");
		//This is printed if the user cannot get it after three tries
	}
}
