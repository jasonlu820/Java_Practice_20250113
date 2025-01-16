package _11constructorExtend;

class Line {
	protected int leng = 5;
	Line(){
		System.out.println("直線長度 = " + leng);
	}
}

class Rectangle extends Line {
	protected int wide = 4;
	Rectangle() {
		System.out.println("矩形面積 = " + (leng * wide));
	}
}

class Cube extends Rectangle {
	protected int high = 3;
	Cube() {
		System.out.println("立方體體積 = " + (leng * wide * high));
	}
}

public class ConstructorExtend {
	public static void main(String[] args) {
		new Cube();   //採匿名物件的方式來建立物件實體
	}
}
