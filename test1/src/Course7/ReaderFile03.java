package Course7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReaderFile03 {
	public static void main(String[] args) {
		String data;
		try {
			System.out.print("請輸入檔案路徑：");
			Scanner scn = new Scanner(System.in);
			String fpath = scn.next();
			FileReader f = new FileReader(fpath);
			BufferedReader bfin = new BufferedReader(f);
			do {
				data = bfin.readLine();
				if (data == null) {
					break;
				}
				System.out.println(data);
			} while (true);
			bfin.close();
			scn.close();
		}
		catch(IOException e) {
			System.out.println("輸入檔案路徑有誤！");
		}
	}
}
