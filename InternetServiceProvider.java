//Nguyen Li
//ISP
//Feb 14

import java.util.Scanner;

public class InternetServiceProvider

{
    public static void main(String[] args)
    {
		Scanner keyboard = new Scanner (System.in);

		//Variables
		char packageLetter;
		double hours,
		charges = 0.0;
		String input;

		//User Input
		System.out.println("Please enter the letter of package purchased (A,B, or C):");
		input = keyboard.nextLine();
		packageLetter = input.charAt(0);

		System.out.println("Please enter the number of hours used:");
		hours = keyboard.nextInt();

	//
	switch (packageLetter)
		{
			//Package A
			case 'a':
				charges = hours > 10 ? 9.95 + (2 * hours) : 9.95;
				System.out.printf("The charges are $%.2f", charges);
				break;
			case 'A':
				charges = hours > 10 ? 9.95 + (2 * hours) : 9.95;
				System.out.printf("The charges are $%.2f", charges);
				break;

				//Package B
			case 'b':
				charges = hours > 20 ? 13.95 + (1 * hours) : 13.95;
				System.out.printf("The charges are $%.2f", charges);
				break;
			case 'B':
				charges = hours > 20 ? 13.95 + (1 * hours) : 13.95;
				System.out.printf("The charges are $%.2f", charges);
				break;

				//Package C
			case 'c':
				System.out.println("The charges are $19.95\n");
				break;
			case 'C':
				System.out.println("The charges are $19.95\n");
				break;
			default:
				System.out.println("Invalid choice\n");
		}
	}
}










