package Course6;

import java.util.Scanner;

public class UserException {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a, b;
		try {
			System.out.print("請輸入第一個數值：");
			a = Integer.parseInt(scn.nextLine());
			System.out.print("請書入第二個數值：");
			b = Integer.parseInt(scn.nextLine());
			System.out.println(a + "/" + b + "=" + a / b);
		}
		catch(ArithmeticException e) {
			System.out.println("算數運算錯誤，如除數為0！");
		}
		catch (NumberFormatException e) {
			System.out.println("錯誤！字串無法轉成數值！");
		}
		scn.close();
	}
}
