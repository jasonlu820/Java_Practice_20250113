package Course10;

class MyThread implements Runnable {
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + "; 印第 " + i + " 次");
		}
	}
}

public class LambdaRunnable1 {
	public static void main(String[] args) {
		MyThread obR = new MyThread();
		Thread t = new Thread(obR);
		t.start();
	}
}
