package Course9;

//ATM 類別，繼承 Thread，代表一台 ATM 機器
class ATM extends Thread {
	Account account;    // 銀行帳戶變數
	long money;    // 存款或提款金額
	
	// 建構子，接收帳戶與交易金額
	public ATM(Account ac, long n) {
		this.account = ac;    // 指定操作的帳戶
		this.money = n;    // 指定存款或提款金額
	}
	
	// 執行緒的 run 方法，執行存款操作
	public void run() {
		account.deposit(money);    // 呼叫帳戶的存款方法
	}
}

//銀行帳戶類別
class Account {
	long balance;    // 帳戶餘額
	
	// 建構子，初始化帳戶餘額
	public Account(long balance) {
		this.balance = balance;
	}
	
	// 存款方法，使用 synchronized 保持執行緒同步，避免競爭條件
	public synchronized void deposit(long amount) {
		long d_balance;    // 定義一個變數來儲存暫時的帳戶餘額
		d_balance = this.balance;    // 讀取當前餘額
		
		System.out.println("帳戶內餘額 = " + d_balance);
		if(amount >= 0) {
			System.out.println("存款增加數 = " + amount);
		}
		else {
			System.out.println("存款減少數 = " + amount);
		}
		System.out.println("交易中......");
		
		try {    // 模擬取得帳戶餘額所需的時間（延遲 3 秒）
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		d_balance += amount;    // 更新帳戶餘額
		
		if(d_balance >= 0) {
			System.out.println("目前帳戶餘額 = " + d_balance + "\n");    // 顯示更新後的餘額
			this.balance = d_balance;    // 更新實際帳戶餘額
		}
		else {
			System.out.println("帳戶餘額不足！\n");
		}
	}
}

public class Transaction {
	public static void main(String[] args) {
		Account account = new Account(5000);
		ATM A1 = new ATM(account, -1000);
		ATM A2 = new ATM(account, 2000);
		ATM A3 = new ATM(account, -9000);
		A1.start();
		A2.start();
		A3.start();
		
		try {
			A1.join();
			A2.join();
			A3.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("最後帳戶的餘額：" + account.balance);
	}
}
