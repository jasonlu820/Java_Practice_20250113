package Course8;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {
	public static void main(String[] args) {
		var hset = new HashSet<>();
		int order = 1;
		int num;
		
		Scanner keyin = new Scanner(System.in);
		System.out.println("請輸入四個 1~30 不重覆的整數....");
		
		while (order <= 4) {
			System.out.print(" 第 " + order + " 個整數？");
			try {
				num = Integer.parseInt(keyin.nextLine());
			}
			catch (NumberFormatException ex) {
				System.out.println(" 請輸入數值！");
				continue;
			}
			if (num < 1 || num > 30) {
				System.out.println(" 整數輸入範圍：1~30，請重新輸入！");
				continue;
			}
			if (hset.add(num))
				order++;
			else
				System.out.println(" 整數 " + num + " 重覆輸入！");
		}
		
		System.out.print("四個整數分別為：");
		System.out.println(hset);
		
		System.out.print("輸入要尋找的整數？");
		int findNum1 = keyin.nextInt();
		if (hset.contains(findNum1)) 
			System.out.println(" 整數 " + findNum1 + " 存在集合物件中");
		else
			System.out.println(" 整數 " + findNum1 + " 不存在集合物件中");
		
		System.out.print("輸入要刪除的整數？");
		int findNum2 = keyin.nextInt();
		if (hset.remove(findNum2)) 
			System.out.println(" 整數 " + findNum2 + " 已刪除！");
		else
			System.out.println(" 整數 " + findNum2 + " 不存在集合物件中");
		
		System.out.println("目前集合物件的元素個數為：" + hset.size());
		keyin.close();
	}
}
