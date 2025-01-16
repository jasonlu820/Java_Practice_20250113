package Course6;

class MyException extends Exception {   //MyException 繼承 Exception
	private String name;
	MyException(String name) {
		this.name = name;
	}
	public String toString() {   //覆寫 Throwable 類別的 toString() 方法
		return "發生 Exception 例外！";
	}
	public String getMessage() {   //覆寫 Throwable 類別的 getMessage() 方法
		return "身高資料不合理！";
	}
	public String getLocalizedMessage() {   //覆寫 getLocalizedMessage() 方法
		return "身高必須介於140~220之間！";
	}
	public void showError() {   //showError() 方法是自定的方法
		System.out.println(name + " 的資料異常！");
	}
}

class Body {
	private float height;
	private int weight;
	private String name;
	
	Body(String name, int weight) {
		this.name = name;
		this.weight = weight;
		System.out.println("姓名：" + name);
	}
	
	void setHeight(int height) throws MyException{
		if (height > 220 || height < 140) 
			throw new MyException(name);   //拋出 MyException 自定例外類別的物件實體
		else
			this.height = (float)(height / 100.0);
	}
	
	void showBMI() {
		System.out.println("BMI值：" + (weight / (height * height)) + "\n");
	}
}

public class Bmi {
	public static void main(String[] args) {
		try {
			Body b1 = new Body("Peter", 60);
			b1.setHeight(170);
			b1.showBMI();
			Body b2 = new Body("Romeo", 220);
			b2.setHeight(240);
			b2.showBMI();   //此行不會執行
		}
		catch(MyException e) {   //捕捉自行定義的 MyException 類別例外
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			e.showError();
		}
	}
}
