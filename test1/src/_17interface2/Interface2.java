package _17interface2;

interface ILimit {
	int HIGH = 110;
	int LOW = 60;
	String Drive();
}

interface IDistance {
	void Process(int min);
	void Keep();
}

class CCar implements ILimit, IDistance {
	private int speed;
	
	CCar(int speed) {
		this.speed = speed;
	}
	
	public String Drive() {
		if (speed > HIGH)
			return "車速" + speed + "km/hr，請減速。";
		else if (speed < LOW)
			return "車速" + speed + "km/hr，請加快。"; 
		else
			return "車速" + speed + "km/hr，請保持。";
	}
	
	public void Process(int min) {
		double leng = speed * min / 60;
		System.out.println("已行駛" + min + "分，跑了" + leng + "公里");
	}
	
	public void Keep() {
		System.out.println("請與前車保持" + (int)(speed / 2) + "公尺以上的距離");
	}
}

public class Interface2 {
	public static void main(String[] args) {
		CCar c1 = new CCar(120);
		System.out.println("c1小型車：");
		System.out.println(c1.Drive());
		c1.Process(2);
		c1.Keep();
	}
}
