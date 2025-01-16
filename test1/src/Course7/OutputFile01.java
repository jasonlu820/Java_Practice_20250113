package Course7;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputFile01 {
	public static void main(String[] args) throws IOException{
		FileOutputStream f1 = new FileOutputStream("C:\\Users\\User\\Documents\\eclipse-workspace\\test1\\src\\Course7\\test1.txt");
		FileOutputStream f2 = new FileOutputStream("C:\\Users\\User\\Documents\\eclipse-workspace\\test1\\src\\Course7\\test2.txt", true);
		String str1 = "Hello World !!!\n", str2 = "Java SE";
		byte b1[] = str1.getBytes(), b2[] = str2.getBytes();
		for (int i = 0; i < b1.length; i++) {
			f1.write(b1[i]);
		}
		for (int i = 0; i < b2.length; i++) {
			f2.write(b2[i]);
		}
		f1.close();
		f2.close();
		System.out.println("檔案寫入完畢！");
	}
}
