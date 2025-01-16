package Course4;

public class TwoDimArray1 {
	public static void main(String[] args) {
		int[][] n = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}};
		int sum = 0;
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[0].length; j++) {
				System.out.print("n[" + i + "][" + j + "] = " + n[i][j] + ", ");
				sum += n[i][j];
			}
			System.out.println();
		}
		System.out.println("n 陣列元素總和為 " + sum);
	}
}
