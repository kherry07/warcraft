package exerios;

import java.util.Scanner;

public class Warcraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "";
		String word2 = "";
		Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter the first word please");
			word1 = keyboard.nextLine();
			System.out.println("Enter the second word please");
			word2 = keyboard.nextLine();
		if (word1 .equals(word2)) {
			System.out.println("the words are same");
		}
		else
		{
			System.out.println(" the words are not same");
		}
	}

}
