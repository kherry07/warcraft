package exerios;
import java.util.Scanner;
public class The_Witcher_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		mostrar(num);

		
	}
	
	 static void mostrar(int num){
		 Scanner keyboard = new Scanner(System.in);
		 System.out.println("Enter the number of times you want to repeat hi");
			num = keyboard.nextInt();
	        for (int i=0;i<num;i++){
	            System.out.println("hi");
	        }
	 }
}
