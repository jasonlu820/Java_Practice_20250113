package Course2;

public class Ex01 {
	public static void main(String[] args) {
		int num = 3;
		String even = "奇數";
		if (num % 2 == 0) {
			even = "偶數";
		}
		System.out.println(num + "為" + even);
	}
}
