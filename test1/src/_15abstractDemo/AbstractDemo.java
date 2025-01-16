package _15abstractDemo;

abstract class CEmployee {   //抽象類別
	protected String name;   //員工姓名
	protected int base = 29000;   //底薪
	protected int prize = 3000;   //每件獎金
	protected int sale_n;   //銷售件數
	
	protected CEmployee(String name) {   //抽象類別的建構式
		this.name = name;
	}
	
	public abstract int Salary();   //抽象方法
}

class CManager extends CEmployee {   //繼承CEmployee抽象類別，要實作抽象方法
	private int bonus;   //經理津貼
	
	CManager(String name, int sale_n, int bonus) {
		super(name);
		this.sale_n = sale_n;
		this.bonus = bonus;
	}
	
	public int Salary() {   //實作Salary()抽象方法
		return base + prize * sale_n + bonus;
	} 
	
	public String GetName() {
		return name;
	}
}

class CSales extends CEmployee {   //繼承CEmployee抽象類別，要實作抽象方法
	CSales(String name, int sale_n) {
		super(name);
		this.sale_n = sale_n;
	}
	
	public int Salary() {   //實作Salary()抽象方法
		return base + prize * sale_n;
	}
	
	public String GetName() {
		return name;
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		CManager m1 = new CManager("王大竹", 2, 18000);
		CManager m2 = new CManager("林英莉", 4, 16000);
		CSales s1 = new CSales("陳萬久", 6);
		CSales s2 = new CSales("李香琳", 5);
		
		System.out.println("姓名     薪水");
		System.out.println("===============");
		System.out.println(m1.GetName() + "   " + m1.Salary() + "元");
		System.out.println(m2.GetName() + "   " + m2.Salary() + "元");
		System.out.println(s1.GetName() + "   " + s1.Salary() + "元");
		System.out.println(s2.GetName() + "   " + s2.Salary() + "元");
		// CEmployee m3 = new CEmployee(name);   -->錯誤，抽象類別無法產生實體
	}
}
