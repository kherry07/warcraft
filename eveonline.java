package exerios;
import java.util.Scanner;
public class eveonline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);

		try {
			
			String word = "";
			System.out.println("enter a word " );
			word = keyboard.nextLine();
		 	  
	        String subcadena = word.substring(3, 5);
	        System.out.println("The fourth and fifth letters are: " + subcadena);
		}
		catch (Exception e)
		{
			System.out.println("the word is very small");
		}
		}
		
		}
		
