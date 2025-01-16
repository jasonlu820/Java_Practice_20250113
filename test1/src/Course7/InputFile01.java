package Course7;

import java.io.FileInputStream;
import java.io.IOException;

public class InputFile01 {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\User\\Documents\\eclipse-workspace\\test1\\src\\Course7\\mytxt.txt");
			int size = fin.available();   //傳回資料流中可讀取的位元組數量
			// 將資料流中的位元組輸入至陣列b
			byte b[] = new byte[size];
			fin.read(b);
			System.out.println("C:\\Users\\User\\Documents\\eclipse-workspace\\test1\\src\\Course7\\mytxt.txt 可讀位元組的數量：" + size);
			//將 byte 型別的b陣列中的資料輸出，將其數值代表的字元輸出至螢幕
			for (int i = 0; i < size; i++) {
				System.out.print((char) b[i]);
			}
		}
		catch(IOException e) {
			System.out.println("輸入檔案路徑有誤！");
		}
	}
}
