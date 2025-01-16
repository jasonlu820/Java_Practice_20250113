package Course7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class OutputFile03 {
	public static void main(String[] args) throws IOException{
		String str = "Hello World!!!";
		byte a[] = str.getBytes();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		out.write(a);
		byte b[] = out.toByteArray();
		int size = b.length;
		for (int i = 0; i < size; i++) {
			System.out.print((char) b[i]);
		}
	}
}
