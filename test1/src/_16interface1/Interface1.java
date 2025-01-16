package _16interface1;

interface IMove {   //IMove介面
	final int ENGINE_NUM = 1;   //介面常數
	public abstract void addSpeed(int a);   //只宣告介面方法，無程式碼
}

class PiliCar implements IMove {   //PiliCar類別實作IMove介面
	private int speed;
	public void addSpeed(int s) {   //實作IMove介面的addSpeed方法
		System.out.println("霹靂車目前速度：" + speed);
		speed += s;
		System.out.println("霹靂車 加速後：" + speed);
	}
}

class BMXCar implements IMove {   //BMXCar類別實作IMove介面
	private int speed;
	public void addSpeed(int s) {   //實作IMove介面的addSpeed方法
		System.out.println("BMX車目前速度：" + speed);
		speed += s;
		if (speed <= 200)
			System.out.println("BMX車 加速後：" + speed);
		else
			System.out.println("BMX車的最大速度為200，無法再加速了！");
	}
}

public class Interface1 {
	public static void main(String[] args) {
		System.out.println("所有車子有 " + IMove.ENGINE_NUM + " 個引擎！");
		PiliCar car1 = new PiliCar();
		car1.addSpeed(150);
		car1.addSpeed(120);
		System.out.println("霹靂車有 " + IMove.ENGINE_NUM + " 個引擎！");
		BMXCar car2 = new BMXCar();
		car2.addSpeed(150);
		car2.addSpeed(120);
		System.out.println("BMX車有 " + IMove.ENGINE_NUM + " 個引擎！");
	}
}
