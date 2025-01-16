package _18interface3;

interface IMove {
	public void showSpeed();
}

interface IFly {
	public void showFly();
}

interface IAnimal extends IMove, IFly {   //IAnimal介面繼承IMove和IFly介面
	public void showAttack();
}

class CAirPlane implements IMove, IFly {   //實作IMove和IFly介面
	public void showSpeed() {
		System.out.println("飛機每一次加速，會增加20公里！");
	}
	
	public void showFly() {
		System.out.println("飛機最快的移動方式，就是飛行！");
	}
}

class CSiteYaMan implements IAnimal {   //實作IAnimal介面
	public void showSpeed() {
		System.out.println("賽雅人每一次加速，會增加30公里！");
	}
	
	public void showFly() {
		System.out.println("賽亞人飛的速度比光速還快！");
	}
	
	public void showAttack() {
		System.out.println("賽亞人攻擊會使用龜派氣功！");
	}
}

public class Interface3 {
	public static void main(String[] args) {
		CAirPlane air1 = new CAirPlane();
		air1.showSpeed();
		air1.showFly();
		System.out.println();
		CSiteYaMan man1 = new CSiteYaMan();
		man1.showSpeed();
		man1.showFly();
		man1.showAttack();
	}
}
