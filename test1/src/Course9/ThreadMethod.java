package Course9;

class MyThread extends Thread {
	MyThread() {
		start();    // 啟動執行緒
	}
	
	public void run() {
		try {
			for(int i = 1; i <= 5; i++) {
				System.out.println(getName() + "執行緒：" + "執行第 " + i + "次");
				sleep(500);    // 執行緒暫停0.5sec
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadMethod {
	public static void main(String[] args) {
		MyThread obT1 = new MyThread();
		obT1.setName("T1");
		System.out.println("目前的執行緒為：" + Thread.currentThread().getName());
		System.out.println("執行緒 T1 是否還活著：" + obT1.isAlive());
		try {
			obT1.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("執行緒 T1 是否還活著：" + obT1.isAlive());
	}
}
