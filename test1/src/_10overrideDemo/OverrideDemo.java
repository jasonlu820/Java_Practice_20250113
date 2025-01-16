package _10overrideDemo;

class CMath {
	public void getMax(int a, int b) {
		int bigNum;
		if (a > b) 
			bigNum = a;
		else 
			bigNum = b;
		System.out.println(a + "和" + b + "的最大數為：" + bigNum);
	}
}

class SonCMath extends CMath {
	public void getMax(int a, int b) {
		if (a > b) 
			System.out.println(a + "和" + b + "的最大數為：" + a);
		else if (a < b)
			System.out.println(a + "和" + b + "的最大數為：" + b);
		else
			System.out.println(a + "和" + b + "一樣大");
	}
}

public class OverrideDemo {
	public static void main(String[] args) {
		CMath math3 = new CMath();
		math3.getMax(20, 20);
		SonCMath math4 = new SonCMath();
		math4.getMax(20, 20);
	}
}
