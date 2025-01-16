package _19polymorphism1;

import java.util.Scanner;

abstract class Shape {   //抽象類別
	abstract double area(double x, double y);   //抽象方法
}

class Triangle extends Shape {   //Triangle類別繼承Shape抽象類別
	public double area(double H, double B) {
		return (H * B) / 2;
	}
}

class Rectangle extends Shape {   //Rectangle類別繼承Shape抽象類別
	public double area(double H, double W) {
		return H * W;
	}
}

public class Polymorphism1 {
	public static void main(String[] args) {
		double high, base;
		Shape sha;   //宣告Shape類別的參考變數sha
		Triangle tri = new Triangle();   //產生Triangle類別的物件tri
		Rectangle rec = new Rectangle();   //產生Rectangle類別的物件rec
		
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.print("請選擇形狀：(1.三角形  2.矩形  0.離開)？");
			int item = scn.nextInt();
			if (item == 1) {
				System.out.print("請輸入 高？");
				high = scn.nextDouble();
				System.out.print("請輸入 底？");
				base = scn.nextDouble();
				System.out.print("三角形： 高 = " + high + "，底 = " + base);
				sha = tri;   //sha參考變數指到tri物件
			} else if (item == 2) {
				System.out.print("請輸入 高？");
				high = scn.nextDouble();
				System.out.print("請輸入 寬？");
				base = scn.nextDouble();
				System.out.print("矩形： 高 = " + high + "，寬 = " + base);
				sha = rec;   //sha參考變數指到rec物件
			} else {
				scn.close();
				break;
			}
			//執行Shape類別的area()方法
			System.out.println("，面積為 " + sha.area(high, base));
		}
	}
}
