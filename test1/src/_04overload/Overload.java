package _04overload;

class Cavg {
	public double getAvg(int num1, int num2) {
		return (num1 + num2) /2;
	}
	
	public double getAvg(int[] vArray) {
		int n = vArray[0];
		for (int i = 1; i < vArray.length; i++) {
			n += vArray[i];
		}
		double avg = (double)n / vArray.length;
		return avg;
	}
}

public class Overload {
	public static void main(String[] args) {
		Cavg num = new Cavg();
		int n1 = 100, n2 = 300;
		int[] ary = {12, 23, 34, 45};
		System.out.println(n1 + " 和 " + n2 + " 平均值為 " + num.getAvg(n1, n2));
		System.out.println("{12, 23, 34, 45} 平均值為 " + num.getAvg(ary));
	}
}
