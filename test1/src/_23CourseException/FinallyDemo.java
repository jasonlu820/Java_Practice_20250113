package _23CourseException;

public class FinallyDemo {
	public static void main(String[] args) {
		int[] myarray = new int[10];
		try {
			myarray[20] = 120;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("例外內容：" + e.toString());
			System.out.println("說明：超出陣列註標範圍！");
		}
		finally {
			System.out.println("執行 finally 程式區塊完成");
		}
		System.out.println("程式執行完畢！");
	}
}
