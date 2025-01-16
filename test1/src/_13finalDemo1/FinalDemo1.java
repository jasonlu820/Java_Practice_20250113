package _13finalDemo1;

final class CDog {
	int weight;
}

/*  因為CDog類別為final，所以CCat無法繼承CDog
class CCat extends CDog{ }
*/

class Ccar {
	// private final int SPEED;   //此寫法錯誤，必須指定初值
	private final int SPEED = 120;
	public final void showBigSpeed(String s) {
		System.out.println(s + " 最大速度是 " + SPEED + " 公里！");
	} 
}

class PiliCcar extends Ccar {
	/*  父類別的showBigSpeed方法為final，所以子類別無法覆蓋
	public void showBigSpeed(String s) {
		System.out.println(s + " 最大速度是 " + SPEED + " 公里！");
	}
	*/
}

public class FinalDemo1 {
	public static void main(String[] args) {
		Ccar car1 = new Ccar();
		car1.showBigSpeed("car1");
		PiliCcar car2 = new PiliCcar();
		car2.showBigSpeed("car2");
	}
}
