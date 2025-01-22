package Course8;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		System.out.println("建立 alist 集合物件...");
		ArrayList<String> alist = new ArrayList<>();
		String[] place = {"蘋果", "水梨", "香蕉", "奇異果", "芭樂"};
		for(String p : place) {
			alist.add(p);
		}
		System.out.println("顯示 alist 集合物件初始元素...");
		System.out.println(alist);
		
		ListIterator<String> litera = alist.listIterator();
		System.out.println("\n修改 alist 集合物件元素...");
		while(litera.hasNext()) {
			litera.next();
			if(litera.nextIndex() == 2) {
				litera.set("葡萄");
			} 
		}
		
		System.out.println("反向走訪 alist 集合元素...");
		while(litera.hasPrevious()) {
			System.out.print(" " + litera.previous());
		}
		System.out.println();
		
		System.out.println("\n新增 alist 集合物件元素...");
		litera = alist.listIterator(3);
		litera.add("火龍果");
		
		System.out.println("顯示 alist 集合物件最終元素");
		System.out.println(alist);
	}
}
