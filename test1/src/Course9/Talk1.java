package Course9;

class ThreadB extends Thread {
	String str;
	int m;
	ThreadB(String a, int s){    // ThreadB 類別的建構式
		str = a;    // str：指定的字串
		m = s;    // m：指定的間隔時間
	}
	public void run() {
		try {
			for(int i = 0; i < str.length(); i++) {
				System.out.print(str.charAt(i));
				sleep(m);    // 暫停執行緒
			}
		}
		catch(InterruptedException e) {
			System.out.println("產生例外...！");
		}
	}
}

public class Talk1 {
	public static void main(String[] args) {
		String str1 = "HELLO,WORLD";
		String str2 = "Java SE 17";
		ThreadB obT1 = new ThreadB(str1, 200);
		ThreadB obT2 = new ThreadB(str2, 500);
		obT1.start();
		obT2.start();
	}
}
