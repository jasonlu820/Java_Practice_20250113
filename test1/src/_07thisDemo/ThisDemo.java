package _07thisDemo;

class Person {
	private int age;
	public void ShowAge(int age) {
		this.age = age;
		age = age + 4;
		System.out.println("傳入的 age 變成 " + age);
		System.out.println("this.age = " + this.age);
	}
}

public class ThisDemo {
	public static void main(String[] args) {
		Person Tom = new Person();
		Tom.ShowAge(18);
	}
}
