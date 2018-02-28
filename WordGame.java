//Programmer: Nguyen Li
//Assignment: Word Game
//Due Date: February 7, 2018
/* Lazy
system.out.print("Enter your name:")
Name = input.nextLine():
*/


import java.util.Scanner;

public class WordGame
{
    public static void main(String[] args)
    {
		Scanner input = new Scanner (System.in);

	String Name;
	int Age;
	String City;
	String College;
	String Profession;
	String Animal;
	String Pet;

	//

	System.out.print("Enter your name:");
	Name = input.nextLine();

	System.out.print("Enter your age:");
	Age = input.nextInt();
	input.nextLine();

	System.out.print("Enter your city:");
	City = input.nextLine();

	System.out.print("Enter your college:");
	College = input.nextLine();

	System.out.print("Enter your profession:");
	Profession = input.nextLine();

	System.out.print("Enter a type of animal:");
	Animal = input.nextLine();

	System.out.print("Enter a pet name:");
	Pet = input.nextLine();

	System.out.println("\nThere once was a person named" + Name +
						" who lived in " + City +
						". At the age of " + Age + ", " + Name +
						" went to college at " + College +
						". " + Name +
						" graduated and went to work as a " + Profession +
						". Then, " + Name + " adopted a(n) " + Animal +
						" named " + Pet + ". They both lived happily ever after! ");

	}

}

/*
•His or her name
•His or her age (as an integer)
•The name of a city
•The name of a college
•A profession
•A type of animal
•A pet's name

Prompt: There once was a person named NAME who lived in CITY.
At the age of AGE, NAME went to college at COLLEGE.
NAME graduated and went to work as a PROFESSION.
Then, NAME adopted a(n) ANIMAL named PETNAME.
They both lived happily ever after!
*/


