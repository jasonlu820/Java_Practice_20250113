package Course8;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		var hset = new HashSet<>();
		hset.add("杜穆濟");
		var babil = Set.of("伊南娜", "尼努爾塔", "杜穆濟", "納姆塔爾");
		for (String p : babil) {
			hset.add(p);
		}
		String myBabil = "阿特拉哈西斯";
		hset.add(myBabil);
		System.out.println("巴比倫神：" + hset);
	}
}
