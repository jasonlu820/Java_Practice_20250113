package _23CourseException;

public class MutiException1 {
	public static void main(String[] args) {
		int[] myarray = new int[10];
		try {
			int test = 120 / 5;
			myarray[5] = 120;
			int n = Integer.parseInt("一百二十");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("例外內容" + e.toString());
			System.out.println("說明：超出陣列註標範圍的例外發生！");
		}
		catch(ArithmeticException e) {
			System.out.println("例外內容" + e.toString());
			System.out.println("說明：數學運算錯誤，除數為0！");
		}
		catch(Exception e) {    // 此catch必須要寫在最後一個catch才行！
			System.out.println("例外內容" + e.toString());
			System.out.println("例外發生！");
		}
		System.out.println("程式正確執行完畢！");
	}
}
