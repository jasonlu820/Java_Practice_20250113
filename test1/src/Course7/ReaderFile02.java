package Course7;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReaderFile02 {
	public static void main(String[] args) {
		try {
			System.out.print("請輸入檔案路徑：");
			Scanner scn = new Scanner(System.in);
			String fpath = scn.next();
			File f = new File(fpath);
			FileReader fin = new FileReader(f);
			int size = (int) f.length();
			String name = f.getName();
			char buffer[] = new char[size];
			System.out.println("檔案名稱：" + name);
			System.out.println("檔案總長度：" + size);
			fin.read(buffer);
			System.out.println(buffer);
			fin.close();
			scn.close();
		}
		catch(IOException e) {
			System.out.println("輸入檔案路徑有誤！！");
		}
	}
}
