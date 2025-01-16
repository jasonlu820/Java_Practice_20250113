package Course3;

import java.util.Scanner;

public class Total {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int price = 0;
		int total = 0;
		while (price >= 0) {
			System.out.print("請輸入單價 (輸入 -1 結束)：");
			price = scn.nextInt();
			if (price > 0) {
				total += price;
			}
		}
		System.out.printf("總價 = %d 元", total);
		scn.close();
	}
}
