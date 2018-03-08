import java.io.IOException;
import java.io.PrintWriter;

public class SudaALicha {
	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(args[0]);

		PrintWriter[] writers = new PrintWriter[] {new PrintWriter("suda.txt"), new PrintWriter("licha.txt")};

		for (int i = 0; i < n; i++) {
			writers[i % 2].println(i);
		}
		for (int i = 0; i < writers.length; i++) {
			writers[i].close();
		}
	}
}

