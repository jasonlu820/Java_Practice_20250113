package _05constructor;

class Rectangle {
	private double high = 20, wide = 10;
	private double area;
	
	private void calArea() {
		area = high * wide;
	}
	
	public Rectangle() {   //類別建構式，沒有傳入引數
		calArea();
	}
	
	public Rectangle(double h) {   //類別建構式，傳入一個引數
		high = h;
		calArea();
	}
	
	public Rectangle(double h, double w) {   //類別建構式，傳入兩個引數
		high = h;
		wide = w;
		calArea();
	}
	
	public double getArea() {
		System.out.printf("長度 = %.1f, 寬度 = %.1f \n", high, wide);
		return area;
	}
}

public class Constructor {
	public static void main(String[] args) {
		System.out.println("矩形一：");
		Rectangle rec1 = new Rectangle();   //使用沒有引數的建構式
		System.out.printf("矩形面積 = %.1f", rec1.getArea());
		
		System.out.println("\n\n矩形二：");
		Rectangle rec2 = new Rectangle(25.5);   //使用一個引數的建構式
		System.out.printf("矩形面積 = %.1f", rec2.getArea());
		
		System.out.println("\n\n矩形三：");
		Rectangle rec3 = new Rectangle(25.5, 12);   //使用兩個引數的建構式
		System.out.printf("矩形面積 = %.1f", rec3.getArea());
	}
}
