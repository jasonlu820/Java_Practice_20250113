package Course2;

import java.util.Scanner;

public class ElseIf {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String member;
		System.out.print("請問您是否為會員:(請輸入Y或N) ");
		member = scn.next();
		if (member.equals("Y")) {
			System.out.println("歡迎使用本系統！");
		} else {
			System.out.println("無法使用本系統！");
		}
		scn.close();
	}
}
