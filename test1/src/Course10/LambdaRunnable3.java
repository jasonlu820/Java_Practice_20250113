package Course10;

public class LambdaRunnable3 {
	public static void main(String[] args) {
		// 建立 t 執行緒物件，並使用 Lambda 實作傳回 Runnable 介面的匿名物件
		Thread t = new Thread(() -> {
			// 實作 Runnable 介面物件的 run() 方法
			for(int i = 1; i <=10; i++) {
				System.out.println(Thread.currentThread().getName() + "; 印第 " + i + " 次");
			}
		});
		t.start();
	}
}
