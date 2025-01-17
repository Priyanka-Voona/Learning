package Java;

import java.util.Scanner;

public class Switchh {
	public static void main(String[]args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter a character");
		char c=s.next().charAt(0);
		switch(c)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		System.out.println("ENTERED CHARACTER IS A VOWEL ");
		break;
		default:
			System.out.println("ENTERED CHARACTER IS NOT A VOWEL");
		}
		
	}

}
