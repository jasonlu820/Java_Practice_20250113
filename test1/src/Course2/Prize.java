package Course2;

import java.util.Scanner;

public class Prize {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入成績：");
		int score = scn.nextInt();
		if (score <= 100 && score >= 0) {
			int prize = switch (score / 10) {
			case 9, 10 -> 500;
			case 8 -> 200;
			default -> 0;
			};
			System.out.println(score + " 分獎學金 " + prize + "元");
		} else {
			System.out.println(score + " 分數超出範圍！");
		}
		scn.close();
	}
}
