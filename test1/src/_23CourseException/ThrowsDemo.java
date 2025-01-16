package _23CourseException;

public class ThrowsDemo {
	static void showSalary(String name, int money) throws IllegalArgumentException {
		System.out.println("員工：" + name);
		if(money >= 20000 && money <= 40000) {
			System.out.printf("\t底薪：%d\t獎金：%.1f\n", money, (int)money * 0.08);
		}
		else {
			throw new IllegalArgumentException("呼叫方法引述錯誤！");
		}
	}
	
	public static void main(String[] args) {
		try {
			showSalary("王曉明", 35000);
			showSalary("李曉華", 50000);
		}
		catch(IllegalArgumentException e) {
			System.out.println("例外內容：" + e.getMessage());
		}
	}
}
