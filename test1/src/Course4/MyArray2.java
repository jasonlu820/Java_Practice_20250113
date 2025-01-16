package Course4;

public class MyArray2 {
	public static void main(String[] args) {
		int[] score = new int[] {42, 67, 90, 32};
		int sum = 0;
		for (int s : score) {
			System.out.println(s);
			sum += s;
		}
		System.out.println("學生成績總和：" + sum);
	}
}
