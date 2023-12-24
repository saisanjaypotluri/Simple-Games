// Class:			CS5000
// Term:				Fall 2023	
// Name:				Sai Sanjay Potluri
// Program Number:	Assignment 2 Program 1
// IDE:				Eclipse
package Assignment2;

import java.util.Scanner;
//importing necessary files from above library to take input from keyboard
public class GuessingGameSanjay
{
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
		System.out.print("Your guess? ");
		//Prints instructions about how to play the game
		int guess1 = input.nextInt();
		//User enters a number which is compared with the generated random number
		if (guess1 == randomnumber)
		{
			System.out.println("That's Correct! Congratulations!");
			System.out.println("Thanks for playing!");
			return;
			//this statement is printed if the number are exactly matched
		}
		else if (guess1 > randomnumber)
		{
			System.out.println("Too high!");
			//Too high is printed if the guessed number is greater than the random number
		}
		else if (guess1 < randomnumber)
		{
			System.out.println("Too low!");
			//Too high is printed if the random number is greater than the guessed number
		}
		System.out.print("Your guess? ");
		int guess2 = input.nextInt();
		//User enters a number which is compared with the generated random number
		if (guess2 == randomnumber)
		{
			System.out.println("That's Correct! Congratulations!");
			System.out.println("Thanks for playing!");
			return;
			//this statement is printed if the number are exactly matched
		}
		else if (guess2 > randomnumber)
		{
			System.out.println("Too high!");
			//Too high is printed if the guessed number is greater than the random number
		}
		else if (guess2 < randomnumber)
		{
			System.out.println("Too low!");
			//Too high is printed if the random number is greater than the guessed number
		}
		System.out.print("Your guess? ");
		int guess3 = input.nextInt();
		//User enters a number which is compared with the generated random number
		if (guess3 == randomnumber)
		{
			System.out.println("That's Correct! Congratulations!");
			System.out.println("Thanks for playing!");
			return;
			//this statement is printed if the number are exactly matched
		}
		else
		{
			System.out.println("Sorry, my number is " + randomnumber);
			System.out.println("Thanks for playing!");
			return;
			//This is printed if the user cannot get it after three tries
		}
	}
}