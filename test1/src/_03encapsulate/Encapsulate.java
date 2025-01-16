package _03encapsulate;

class Rectangle {
	private double high, wide;
	private double area = 0, peri = 0;
	
	private void calArea() {
		area = high * wide;
	}
	
	private void calPeri() {
		peri = (high + wide) * 2;
	}
	
	public void setValue(double h, double w) {   //傳入引數
		high = h;
		wide = w;
		calArea();
		calPeri();
	}
	
	public double getArea() {
		return area;   //傳出面積資料
	}
	
	public double getPeri() {
		return peri;   //傳出周長資料
	}
}

public class Encapsulate {
	public static void main(String[] args) {
		Rectangle rec2 = new Rectangle();
		double h2 = 30;
		double w2 = 15.5;
		rec2.setValue(h2, w2);
		System.out.println("*** 矩形物件rec2 ***");
		System.out.println("長度 = " + h2);
		System.out.println("寬度 = " + w2);
		System.out.println("面積 = " + rec2.getArea());
		System.out.println("周長 = " + rec2.getPeri());
	}
}
