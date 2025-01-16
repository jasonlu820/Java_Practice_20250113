package Course5;

public class Recursive {
	static int f(int n) {
		if (n == 1) 
			return n;
		else
			return n * f(n - 1);
	}
	
	public static void main(String[] args) {
		System.out.println("6! = " + f(6));
		System.out.println("9! = " + f(9));
	}
}
