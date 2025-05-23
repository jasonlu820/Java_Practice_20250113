package Course9;

class Drive implements Runnable {
	public void run() {
		System.out.println("老王到停車場");
		System.out.println("愛車在停車場內");
		Thread machine = new Thread(new Power());    // 宣告 machine 執行緒
		machine.start();    // 啟動 machine 執行緒，停車場開始運作
		try {
			machine.join();    // 讓 machine 執行緒先執行
		}
		catch(InterruptedException e) {
			System.out.println("老王放棄取車！");
		}
		System.out.println("老王可以開車離開");
	}
}

class Power implements Runnable {
	public void run() {
		System.out.println("機械式停車場開始運轉");
		try {
			for(int i = 1; i <= 6; i++) {
				Thread.sleep(100);
				System.out.print(i * 5 + "秒...");
			}
			System.out.println();
		}
		catch(InterruptedException e) {
			System.out.println("停車場故障，無法取車！");
		}
		System.out.println("您的愛車已經到達出口！");
	}
}

public class Parking {
	public static void main(String[] args) {
		Thread wang = new Thread(new Drive());
		wang.start();
	}
}
