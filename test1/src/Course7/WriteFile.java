package Course7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) {
		try {
			String fpath = "C:\\Users\\User\\Documents\\eclipse-workspace\\test1\\src\\Course7\\test1.txt";
			File f = new File(fpath);
			if (! f.exists()) {
				if (f.createNewFile())
					System.out.println(fpath + "檔案創建成功！");
			}
			BufferedWriter font = new BufferedWriter(new FileWriter(fpath));
			font.write("一盞清茶，可品可飲可溫喉！");
			font.newLine();
			font.close();
			System.out.println(fpath + " 寫檔完成！");
		}
		catch(IOException e) {
			System.out.println("輸入檔案路徑有誤！");
		}
	}
}
