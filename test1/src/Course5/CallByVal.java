package Course5;

public class CallByVal {
	public static void main(String[] args) {
		int a = 10, b = 15;
		System.out.println("傳值呼叫前\t a = " + a + "\t b = " + b);
		byVal(a, b);
		System.out.println("傳值呼叫後\t a = " + a + "\t b = " + b);
	}
	
	static void byVal(int x, int y) {
		int t;
		t = x;
		x = y;
		y = t;
		System.out.println("傳值呼叫中\t x = " + x + "\t y = " + y);
	}
}
