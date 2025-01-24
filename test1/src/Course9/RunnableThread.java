package Course9;

class MyThread2 implements Runnable {
	int m;    // m為執行的次數
	MyThread2(int a) {
		m = a;
	}
	
	public void run() {
		for(int i = 1; i <= m; i++) {
			System.out.println(Thread.currentThread().getName() + " = " + i);
		}
	}
}

public class RunnableThread {
	public static void main(String[] args) {
		 MyThread2 obR1 = new MyThread2(20);
		 MyThread2 obR2 = new MyThread2(25);
		 Thread obT1 = new Thread(obR1, "執行緒1");
		 Thread obT2 = new Thread(obR2, "執行緒2");
		 obT1.start();
		 obT2.start();
	}
}
