package Course5;

public class Static1 {
	static void sub(int x, int y) {   //被呼叫方法主體
		System.out.print("呼叫 Static1 類別的sub方法-->");
		System.out.println(x + " - " + y + " = " + (x - y));
	}
	
	public static void main(String[] args) {
		int a = 25;
		//呼叫同一類別的sub方法
		sub(a - 5, 3);   //呼叫敘述
		//呼叫不同類別的sub方法
		Static2.sub(a + 3, 5);   //呼叫敘述
	}
}

class Static2 {
	static void sub(int x, int y) {   //被呼叫的主體
		System.out.print("呼叫 Static2 類別的sub方法-->");
		System.out.println(x + " - " + y + " = " + (x - y));
	}
}
