package exerios;
import java.util.Scanner;
public class Minecraft {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.print("Ingresa una frase: ");
		        String frase = scanner.nextLine();

		       
		        String cadenaInvertida = "";

		        
		        for (int i = frase.length() - 1; i >= 0; i--) {
		            cadenaInvertida += frase.charAt(i); 
		        }

		      
		        System.out.println("Frase invertida: " + cadenaInvertida);

		        
		    }
		

		}

