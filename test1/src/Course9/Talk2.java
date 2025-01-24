package Course9;

class ThreadX extends Thread {
	String str;
	int m;
	ThreadX(String a, int s) {    // ThreadB 類別的建構式
		str = a;    // str：指定的字串
		m = s;    // m：指定的間隔時間
		start();    // 呼叫建構式時，直接啟動執行緒
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

public class Talk2 {
	public static void main(String[] args) {
		String str1 = "HELLO,WORLD";
		String str2 = "Java SE 17";
		ThreadX obT1 = new ThreadX(str1, 200);
		ThreadX obT2 = new ThreadX(str2, 500);
	}
}
