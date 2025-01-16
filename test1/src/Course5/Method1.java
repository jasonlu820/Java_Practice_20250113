package Course5;

public class Method1 {
	public static void main(String[] args) {
		factorial(5);
		factorial(8);
	}
	
	static void factorial(int x) {
		int i = x, j = 1;
		while (i > 0) {
			j *= i--;
		}
		System.out.println(x + "! = " + j);
	}
}
