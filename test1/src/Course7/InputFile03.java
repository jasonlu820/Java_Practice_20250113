package Course7;

import java.io.ByteArrayInputStream;

public class InputFile03 {
	public static void main(String[] args) {
		String str = "Believe in yourself!";
		byte b[] = str.getBytes();
		ByteArrayInputStream f = new ByteArrayInputStream(b);   //將陣列b的資料輸入到資料流中
		int size = f.available();
		for (int i = 0; i < size; i++) {
			int ch = f.read();
			System.out.print((char) ch);
		}
	}
}
