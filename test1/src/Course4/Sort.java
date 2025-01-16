package Course4;
import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int[] num = new int[] {14, 3, 2, 6, 13, 1};
		Arrays.sort(num);
		for (int n : num) {
			System.out.print(n + ", ");
		}
	}
}
