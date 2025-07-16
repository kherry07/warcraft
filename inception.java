package exerios;

public class inception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 5;
		int number2 = 0;
		int number3 = 0;
		
		try {
			number3 = number1/number2;
			
		}
		catch (Exception e) {
			System.out.println("cannot be divided by zero");
		}
		
	}

}
