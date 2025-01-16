package Course2;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char grade;
		System.out.print("請輸入考試分數：");
		int score = scn.nextInt();
		switch (score / 10) {
		case 10:
		case 9:
		case 8:
			grade = '甲';
			break;
		case 7:
			grade = '乙';
			break;
		case 6:
			grade = '丙';
			break;
		default:
			grade = '丁';
		}
		System.out.println(score + " 分是屬於 " + grade + " 級的成績。");
		scn.close();
	}
}
