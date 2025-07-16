package exerios;

public class gta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculatetriangleArea(40,6);
		calculatetriangleArea(37,10);
		calculatetriangleArea(48,9);
		calculatetriangleArea(59,4);
		calculatetriangleArea(83,30);
	}
	public static void calculatetriangleArea(double base,double  height) {
		
		double triangleArea = 0 ;
		triangleArea = (base * height) / 2 ;
		System.out.println("The area of the triangle with height " + base +" and base "+ height +" is " + triangleArea );	}
}
