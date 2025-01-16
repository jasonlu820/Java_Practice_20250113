package _23CourseException;

public class ExceptionMethod {
	static int[] data = new int[10];
	public static void init() {
		data[10] = 250;
	}
	
	public static void main(String[] args) {
		try {
			init();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("例外內容：" + e.toString());
			System.out.println("說明：超出陣列註標範圍！");
		}
	}
}
