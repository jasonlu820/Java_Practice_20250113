package Course3;

import java.util.Scanner;

public class MenuDemo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = 0;
		String sel;
		do {
			System.out.println("********** 選單 **********");
			System.out.println("\tA. 平方");
			System.out.println("\tB. 三次方");
			System.out.println("\tC. 離開系統");
			System.out.println("*************************");
			
			do {
				System.out.print("請選擇功能：");
				sel = scn.next().toUpperCase();
			} while ("ABC".indexOf(sel) == -1);
			
			if(!(sel.equals("C"))) {
				System.out.print("請輸入整數：");
				num = scn.nextInt();
			}
			
			switch (sel) {
			case "A":
				System.out.printf("%d 的平方 = %d%n", num, num*num);
				break;
			case "B":
				System.out.printf("%d 的三次方 = %d%n", num, num*num*num);
				break;
			case "C":
				System.out.println("結束程式！");
			}
		} while (!(sel.equals("C")));
		scn.close();
	}
}
