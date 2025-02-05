package Course9;

class GoldClass implements Runnable {
	int grabed;    // 已偷到的金塊數量
	static int totalGold = 20000000;
	Thread t;

	GoldClass(String name) {
		grabed = 0;
		t = new Thread(this, name);
		t.start();
	}

	public void run() { 
		while (grabGold() == true) { 
			grabed++;    // 偷到一塊
		}
		System.out.println(t.getName() + " 總共偷得 " + grabed + " 個金塊");
	}

	// 加上 synchronized 將 grabGold() 同步，鎖定一次只允許一個執行緒來修改 totalGold 的值
	private synchronized static boolean grabGold() {  
		if (totalGold > 0) {    // 若金塊還有剩才能偷
			totalGold--;    // 偷一塊金塊
			return true;
		} 
		else {
			return false;
		}
	}
}

public class NonSynchronizedDemo {
	public static void main(String[] args) {
		System.out.println("共有 " + GoldClass.totalGold + " 個金塊!");
		GoldClass tA = new GoldClass("張三");
		GoldClass tB = new GoldClass("李四");
		GoldClass tC = new GoldClass("王五");
	}
}
