package statickeyword;
public class StaticMethodExample {	
	public static void main(String[] args) {
		
		System.out.println("Factorial Of a number : "+factorial(6));
	}
	public static int factorial(int n) {
		int fact = 1;
		for(int i = 1;i <= n;i++) {
			fact = fact * i;
		}
		return fact;
	}
}
