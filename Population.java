//
//Population
//Feb 26

/**
Write a program that will predict the size of a population of organisms.
The program should ask for the starting number of organisms,
their average daily population increase,
and the number of days they will multiply.
For example, a population might begin with two organisms,
have a daily average increase of 50 percent,
and will be allowed to multiply for seven days.
The program should use a loop to display the size of the population for each day.

Input Validation: Do not accept a number less than 2 for the starting size of the population.
Do not accept a negative number for average daily population increase.
Do not accept a number less than 1 for the number of days they will multiply.
*/

import java.util.Scanner;	//Needed for scanner class
import java.io.*;

public class Population
{
    public static void main(String[] args) throws IOException
    {
		//Defines scanner input as keyboard
		Scanner Keyboard = new Scanner (System.in);

		//Command to create a new txt file "population"


		//Variables
		double organisms;	//Starting number of organisms
		double increase;	//Average daily population increase
		int days;			//Number of days they will multiply


		 //Prompts starting organisms
		System.out.print("Enter number of organisms:");
		organisms = Keyboard.nextDouble();

		//Prompts rate of change
		System.out.print("Enter the daily increase:");
		increase = Keyboard.nextDouble();

		//Prompts number of days to multiply
		System.out.print("Enter the number of days the organisms will multiply:");
		days = Keyboard.nextInt();


		//Input Validation: Do not accept a number less than 2 for the starting size of the population
		while (organisms < 2);
		{
			System.out.println("That number is invalid.");
			System.out.print("The starting number must be 2 or greater.");
			organisms = Keyboard.nextDouble();
		}

		//Input Validation: Do not accept a negative number for average daily population increase.
		while (increase < 0);
		{
			System.out.println("That number is invalid.");
			System.out.print("Please enter a positive number.");
			increase = Keyboard.nextDouble();
		}

		//Input Validation: Do not accept a number less than 1 for the number of days they will multiply.
		while (days < 1);
		{
			System.out.println("That number is invalid.");
			System.out.print("The starting number must be 1 or greater.");
			days = Keyboard.nextInt();
		}

		// Newline
		System.out.println("");

		//Displays total
		System.out.println("Day                   Organisms" +
						   "--------------------------------");
		for (int x = 1; x <= x; x++);
		{
			organisms = organisms*(increase + 1);
			System.out.print(days+"     "+organisms);
			System.out.println();
		}
	}
}

















