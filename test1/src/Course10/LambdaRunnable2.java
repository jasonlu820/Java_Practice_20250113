package Course10;

public class LambdaRunnable2 {
	public static void main(String[] args) {
		// 建立 t 執行緒物件，並帶入 Runnable 介面的匿名物件
		Thread t = new Thread(new Runnable() {
			public void run() {
				for(int i = 1; i <= 10; i++) {
					System.out.println(Thread.currentThread().getName() + "; 印第 " + i + " 次");
				}
			}
		});
		t.start();
	}
}
