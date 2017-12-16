//Zac Thamer
//Period 3
//2/10/16
//Uses algorithms to replicate ACSL string functions based off of the user's input
import java.util.Scanner;

public class ACSLStrings 
{
	//Divides a given string (a) into substrings of length n separated by the given character
	public static String char_split (String a, int n, char theChar)
	{

		int start = 0;
		int end = n;
		String newA = "";
		while (end <= a.length())
		{
			String two = a.substring(start,end) + theChar;
			newA += two;	

			start+=n;
			end += n;

			if (end >= a.length())
			{
				two = a.substring(start,a.length());
				newA += two;	
				return newA;
			}
		}

		return newA;
	}

	//Removes all occurrences of b
	public static String strrem (String a, String b)
	{
		a = a.replace(b, "");

		return a;
	}

	//searches 'a' for the first occurrence of b and returns the character b if found
	public static String strchr (String a, String b)
	{
		int bIndex = a.indexOf(b);
		a = a.substring(0, bIndex);
		return a;
	}

	//splits 'a' into substrings each time the character b is found 
	public static String strtok (String a, char b)
	{
		String returnString = "";
		for (int i = 0; i<a.length(); i++)
		{

			if (b == a.charAt(i))
			{
				returnString += " ";
			}
			returnString+= a.charAt(i);
		}
		return returnString;
	}

	//outputs the substrings of 'a' that are a maximum of n characters in length or that begin
	public static String wordwrap (String a, int n, char b)
	{
		int subLength = 0;
		String returnString = "";
		for (int i = 0; i<a.length(); i++)
		{
			
			if (b == a.charAt(i) || subLength == n)
			{
				subLength = 0; 
				returnString += " ";
			}
			subLength++;
			returnString+= a.charAt(i);

		}
		return returnString;
	}

	public static void main (String[]args)
	{
		Scanner input = new Scanner (System.in);//standard input
		String returnString="";
		int i;
		for(i=0;i<5;i++)
		{
			System.out.print(i+1 + ". ");
			String line = input.nextLine();
			String[] parts = line.split(",");

			if (i==0)
			{
				int n = Integer.parseInt(parts[1]);
				char c= parts[2].charAt(0);
				returnString = char_split(parts[0], n, c);
			}

			if(i==1)
			{
				returnString = strrem(parts[0], parts[1]);
			}

			else if (i == 2)
			{
				returnString = strchr(parts[0], parts[1]);
			}
			else if (i == 3)
			{
				returnString = strtok(parts[0], parts[1].charAt(0));
			}

			else if (i == 4)
			{
				int n = Integer.parseInt(parts[1]);
				char c= parts[2].charAt(0);
				returnString = wordwrap(parts[0], n, c);
			}


			System.out.println(returnString);
		}


		//MISSISSIPPI,2,*
		//MISSISSIPPI,IS
		//MISSISSIPPI,P
		//MISSISSIPPI,I
		//MISSISSIPPI,2,I
		
		//AGGRESSIVENESS,3,E


		input.close();
	}
}