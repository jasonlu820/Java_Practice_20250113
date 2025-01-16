package Course2;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int year;
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入西元年：");
		year = scn.nextInt();
		if (year % 100 != 0) {
			if (year %4 == 0) {
				System.out.printf("西元 %d 年是閏年", year);
			}else {
				System.out.printf("西元 %d 年不是閏年", year);
			}
		} else {
			if (year %400 == 0) {
				System.out.printf("西元 %d 年是閏年", year);
			}else {
				System.out.printf("西元 %d 年不是閏年", year);
			}
		}
		scn.close();
	}
}
