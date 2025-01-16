package Course7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteAppend {
	public static void main(String[] args) {
		try {
			System.out.print("請輸入檔案路徑：");
			Scanner scn = new Scanner(System.in);
			String fpath, newdata;
			fpath = scn.nextLine();
			File f = new File(fpath);
			if (! f.exists()) {
				if (f.createNewFile())
					System.out.println(fpath + " 檔案建立成功！");
			}
			System.out.print("請輸入新增資料：");
			newdata = scn.nextLine();
			BufferedWriter font = new BufferedWriter(new FileWriter(fpath, true));   //true：表示不會蓋掉原資料
			font.write(newdata);
			font.newLine();
			font.close();
			scn.close();
			System.out.println(fpath + " 寫檔完成\n加入：" + newdata);
		}
		catch(IOException e) {
			System.out.println("輸入的檔案路徑有誤！");
		}
	}
}
