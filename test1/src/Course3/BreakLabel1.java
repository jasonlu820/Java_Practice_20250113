package Course3;

public class BreakLabel1 {
	public static void main(String[] args) {
		boolean i = false;
		Block1: {
			System.out.println("這是第一個敘述區塊");
			i = true;
			Block2: {
				if (i == true)
					break Block2;
				System.out.println("這是第二個敘述區塊");
			}
			System.out.println("已經跳出了第二個敘述區塊！");
		}
	}
}
