//Zac Thamer
//Period 3
//2/10/16
//Rounds the user's input to a certain degree
import java.util.Scanner;
public class ACSLStringsSenior 
{
	//To make your value round to n decimal places you could multiply by  10n10n , and then divide by  10n10n .
	public static double STR(double floating, int length, int decimal)
	{
		
		
		for (int i = 0; i < decimal; i ++)
		{
		Math.round(floating/10);
		}
		return floating;

	}

	public static void main (String[]args)
	{
		Scanner input = new Scanner (System.in);//standard input
		double returnString = 0;
		int i;
		for(i=0;i<5;i++)
		{
			System.out.print(i+1 + ". ");
			String line = input.next();
			String[] parts = line.split(",");

			if (i==0)
			{
				int n = Integer.parseInt(parts[1]);
				int d = Integer.parseInt(parts[2]);
				double floating = Double.parseDouble(parts[0]);
				
				returnString = STR(floating, n, d);
			}

			System.out.println(returnString);
		}


		//523.125,6,2
		//MISSISSIPPI,IS
		//MISSISSIPPI,P
		//MISSISSIPPI,I
		//MISSISSIPPI,2,I

		//


		input.close();

	}
}
