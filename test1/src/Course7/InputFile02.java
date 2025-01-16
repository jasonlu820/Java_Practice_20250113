package Course7;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InputFile02 {
	public static void main(String[] args) {
		try {
			BufferedInputStream fin = new BufferedInputStream(new FileInputStream("C:\\Users\\User\\Documents\\eclipse-workspace\\test1\\src\\Course7\\mytxt.txt"));
			int size = fin.available();
			byte b[] = new byte[size];
			fin.read(b);
			System.out.println("C:\\Users\\User\\Documents\\eclipse-workspace\\test1\\src\\Course7\\mytxt.txt 可讀位元組的數量：" + size);
			for (int i = 0; i < size; i++) {
				System.out.print((char) b[i]);
			}
			fin.close();
		}
		catch(IOException e) {
			System.out.println("輸入檔案路徑有誤！");
		}
	}
}
