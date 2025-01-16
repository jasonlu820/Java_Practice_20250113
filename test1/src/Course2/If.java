package Course2;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入金額：");
		int money = scn.nextInt();
		if (money > 1000) {
			money = 1000 + (int) ((money - 1000) * 0.9);
		}
		System.out.printf("實付金額：%d 元", money);
		scn.close();
	}
}
