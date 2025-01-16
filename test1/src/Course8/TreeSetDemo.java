package Course8;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		var tset = new TreeSet<>();
		String[] character = {"box", "dog", "help", "time", "ox", "map", "apple", "flag", "cat", "banana"};
		for (String s : character) {
			tset.add(s);
		}
		System.out.println("物件內元素內容：");
		System.out.println(" " + tset);
		System.out.println("第一個元素內容為：" + tset.first());
		System.out.println("最後一個元素內容為：" + tset.last());
		Scanner keyin = new Scanner(System.in);
		
		String str1;
		while (true) {
			System.out.print("\n請輸入其中一個英文單字？");
			str1 = keyin.nextLine();
			if (tset.contains(str1)) {
				break;
			}
			System.out.println(" " + str1 + " 單字不在集合物件中");
		}
		System.out.print(" 從 " + str1 + " 單字開始排列的元素內容：");
		System.out.println(tset.tailSet(str1));
		keyin.close();
	}
}
