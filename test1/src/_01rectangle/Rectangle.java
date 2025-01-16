package _01rectangle;

public class Rectangle {
	public double high, wide;
	public double area = 0;
	private double peri = 0;
	
	public double getPeri(double h, double w) {
		high = h;
		wide = w;
		peri = (high + wide) * 2;
		return peri;
	}
	
	public void calArea() {
		area = high * wide;
	}
	
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		rec1.high = 20;
		rec1.wide = 10.5;
		rec1.calArea();
		double r1_peri = rec1.getPeri(30, 40);
		
		System.out.println("*** 矩形物件rec1 ***");
		System.out.println("高度 = " + rec1.high);
		System.out.println("寬度 = " + rec1.wide);
		System.out.println("面積 = " + rec1.area);
		System.out.println("周長 = " + r1_peri);
	}
	
}
