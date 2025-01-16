package Course7;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReaderFile01 {
	public static void main(String[] args) {
		try {
			System.out.print("請輸入檔案路徑：");
			Scanner scn = new Scanner(System.in);
			String fpath = scn.next();
			char buffer[] = new char[100];
			FileReader fin = new FileReader(fpath);
			fin.read(buffer);
			System.out.println(buffer);
			fin.close();
			scn.close();
		}
		catch(IOException e) {
			System.out.println("輸入檔案路徑有誤！");
		}
	}
}
