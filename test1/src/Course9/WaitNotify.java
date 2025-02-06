package Course9;

class Frisbee {    // 在 Frisbee 類別中設定飛盤物件的屬性與方法
	private boolean isThrow = false;    // 紀錄飛盤是否丟出，false = 未丟出
	
	public synchronized void throwF(int tNo) {    // 丟飛盤的方法
		while(isThrow) {    // 當 isThrow 為 true 就持續執行
			try {
				wait();    // 主人進入等待狀態
			}
			catch(InterruptedException e) { }
		}
		System.out.println("丟出第" + tNo + "個飛盤");
		isThrow = true;    // 設定飛盤為丟出
		notify();    // 呼叫小狗來接飛盤
	}
	
	public synchronized void accessF(int aNo) {    // 接飛盤的方法
		while(!isThrow) {    // 當 isThrow 為 false 就持續執行
			try {
				wait();    // 小狗進入等待狀態
			}
			catch(InterruptedException e) { }
		}
		System.out.println("接到第" + aNo + "個飛盤");
		isThrow = false;    // 設定飛盤為未丟出
		notify();    // 呼叫主人丟飛盤
	}
}

class ThrowFrisbee implements Runnable {    // ThrowFrisbee 類別實作 Runnable 介面
	Frisbee frisbee;    // 建立 Frisbee 類別物件 frisbee
	ThrowFrisbee(Frisbee frisbee) {    // 建構子
		this.frisbee = frisbee;
	}
	public void run() {    // 在run()方法中執行丟飛盤 5 次
		for(int i = 1; i <= 5; i++) {
			frisbee.throwF(i);
		}
	}
}

class AccessFrisbee implements Runnable {    // AccessFrisbee 類別實作 Runnable 介面
	Frisbee frisbee;    // 建立 Frisbee 類別物件 frisbee
	AccessFrisbee(Frisbee frisbee) {    // 建構子
		this.frisbee = frisbee;
	}
	public void run() {    // 在run()方法中執行接飛盤 5 次
		for(int i = 1; i <= 5; i++) {
			frisbee.accessF(i);
		}
	}
}

public class WaitNotify {
	public static void main(String[] args) {
		Frisbee frisbee = new Frisbee();    // 建立 Frisbee 類別物件 frisbee
		Thread master = new Thread(new ThrowFrisbee(frisbee));
		Thread dog = new Thread(new AccessFrisbee(frisbee));
		master.start();    //啟動 master 執行緒執行丟飛盤
		dog.start();    //啟動 dog 執行緒執行接飛盤
	}
}
