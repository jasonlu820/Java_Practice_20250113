package Course5;

public class Math {
	static void mul(int x, int y) {   //呼叫此方法時不須建立Math類別的物件實體，可直接呼叫使用
		System.out.print(x + "*" + y + "=" + (x * y));
	}
	
	void div(int x, int y) {   //呼叫此方法須先使用new建立Math類別的物件實體，才可以使用div()方法
		System.out.print(x + "/" + y + "=" + (x / y));
	}
}
