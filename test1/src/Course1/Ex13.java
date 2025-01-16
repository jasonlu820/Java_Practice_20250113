package Course1;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入整數：");
		try {
			String num1 = scn.next();
			System.out.printf("輸入值為 %d%n", Integer.parseInt(num1));
		} catch (NumberFormatException e) {
			System.out.print("輸入的值不是整數！");
		}
		scn.close();
	}
}
