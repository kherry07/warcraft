package exerios;

public class balduregate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max;
		max = maximo(3,9,5);
		System.out.println("el numero ,as grande es " +max);
	}

	public static int maximo(int a,int b,int c) {
		int max = 0;
		if (a>b && a>c )
			max = a;
		else
			if (b>c && b>a)
				max = b;
			else 
				max = c;
		return max;
	}
}
