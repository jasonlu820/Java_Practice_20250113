package Course8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		var showgirl = List.of("Angel", "路小璇", "培培", "Wendy", "芭芭樂");
		var ary = new ArrayList<>();
		for (String g : showgirl) {
			ary.add(g);
		}
		System.out.println("Showgirl進場順序(串列元素先後順序)：");
		for (int i = 0; i < ary.size(); i++) {
			System.out.println("第 " + (i + 1) + " 位：" + ary.get(i));
		}
		var queue = new LinkedList<>(ary);
		System.out.println("\n佇列方式出場：FIFO");
		for (int j = queue.size() - 1; j >= 0; j--) {
			System.out.print(" " + queue.getFirst());
			queue.removeFirst();
		}
		System.out.println();
		
		var stack = new LinkedList<>(ary);
		System.out.println("\n堆疊方式出場：LIFO");
		while(true) {
			System.out.print(" " + stack.removeLast());
			if (stack.isEmpty())
				break;
		}
	}
}
