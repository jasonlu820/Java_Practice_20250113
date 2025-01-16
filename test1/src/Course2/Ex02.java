package Course2;

public class Ex02 {
	public static void main(String[] args) {
		int max, n1 = 2, n2 = 3;
		if (n1 > n2) {
			max = n1;
		} else {
			max = n2;
		}
		max = (n1 > n2) ? n1 : n2;		
		System.out.println(max);
	}
}
