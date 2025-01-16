package Course7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputFile02 {
	public static void main(String[] args) throws IOException{
		BufferedOutputStream fout = new BufferedOutputStream(new FileOutputStream("C:\\Users\\User\\Documents\\eclipse-workspace\\test1\\src\\Course7\\Sample.txt"));
		String str = "Hang on to your dreams!";
		byte b[] = str.getBytes();
		for (int i =0; i < b.length; i++) {
			fout.write(b[i]);
		}
		fout.close();
		System.out.println("檔案寫入完畢！");
	}
}
