import java.util.Scanner;
import java.io.InputStream;
import java.io.IOException;

public class SystemIn {
	public static void main(String[] args) throws IOException {
		InputStream ss = System.in;
		System.out.println(ss.read());
	}
}
