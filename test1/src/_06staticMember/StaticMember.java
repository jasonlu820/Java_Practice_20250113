package _06staticMember;

class Student {
	public static int count = 0;   //公有類別變數
	public int num = 0;   //公有實體變數
	private int tot;
	
	public Student() {   //為Student類別的建構子
		count++;
		num++;
	}
	
	public int GetTot(int chi, int eng) {
		tot = chi + eng;
		return tot;
	}
}

public class StaticMember {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1.num = " + s1.num);
		System.out.println("第 " + Student.count + " 位");
		System.out.println("總分 = " + s1.GetTot(80, 90));
		System.out.println();
		
		Student s2 = new Student();
		System.out.println("s2.num = " + s2.num);
		System.out.println("第 " + Student.count + " 位");
		System.out.println("總分 = " + s2.GetTot(100, 100));
		System.out.println();
		
		Student s3 = new Student();
		System.out.println("s3.num = " + s3.num);
		System.out.println("第 " + Student.count + " 位");
		System.out.println("總分 = " + s3.GetTot(85, 99));
	}
}
