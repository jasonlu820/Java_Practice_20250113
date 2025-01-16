package Course2;

import java.util.Scanner;

public class ElseIfElse {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入用水度數：");
		int deg = scn.nextInt();
		double unit;
		if (deg <= 10) {
			unit = 7.35;
		} else if (deg > 10 && deg <= 30) {
			unit = 9.45;
		} else if (deg > 30 && deg <= 50) {
			unit = 11.55;
		} else {
			unit = 12.075;
		}
		System.out.printf("每度：%6.3f 元%n", unit);
		System.out.printf("實付水費：%d 元", (int) (deg * unit));
		scn.close();
	}
}
