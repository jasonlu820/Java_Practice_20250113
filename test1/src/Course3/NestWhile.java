package Course3;

import java.util.Scanner;

public class NestWhile {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String msg = "座號\t計概\t程設\t總分\n";
		String score = "";
		int sum = 0; int no = 1; int sub = 0;
		while (no > 0) {
			System.out.print("請輸入座號：");
			no = Integer.parseInt(scn.nextLine());
			if (no > 0) {
				msg += no + "號\t";
			}
			sum = 0; sub = 0;
			while (no > 0 && ++sub <= 2) {
				System.out.printf("請輸入%d號%s分數：", no, (sub == 1 ? "計概" : "程設"));
				score = scn.nextLine();
				msg += score + "\t";
				sum += Integer.parseInt(score);
			}
			if (no > 0) {
				msg += sum + "\n";
			}
		}
		System.out.println(msg);
		scn.close();
	}
}
