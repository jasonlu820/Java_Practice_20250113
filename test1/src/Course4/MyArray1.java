package Course4;

public class MyArray1 {
	public static void main(String[] args) {
		int[] n = new int[] {42, 67, 90, 32};
		int sum = 0;
		for (int i = 0; i < n.length; i++) {
			System.out.println("n[" + i +"] = " + n[i]);
			sum += n[i];
		}
		System.out.println("n陣列元素總和為：" + sum);
	}
}
