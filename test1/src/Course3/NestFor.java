package Course3;

public class NestFor {
	public static void main(String[] args) {
		for (int y = 1; y <= 9; y++) {
			for (int x = 2; x <=9; x++) {
				System.out.printf("%dx%d=%2d ", x, y, x*y);
			}
			System.out.println();
		}
	}
}
