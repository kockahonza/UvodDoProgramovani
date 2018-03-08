import java.io.IOException;
import java.io.PrintWriter;

public class Nasobky {
	public static void main(String[] args) throws IOException {
		int n = 3;
		int max = 1000;

		PrintWriter writer = new PrintWriter("nasobky.txt");

		for (int i = 0; i < max; i += n) {
			writer.printf("%d, ", i);
			if ((i / 3) % 10 == 9) {
				writer.printf("\n");
			}
		}
		writer.close();
	}
}
