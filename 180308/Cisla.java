import java.io.IOException;
import java.io.FileReader;

public class Cisla {
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("cisla.dat");
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		java.util.Scanner sc = new java.util.Scanner(reader);
		while (sc.hasNextInt()) {
			int val = sc.nextInt();
			if (val < min) {
				min = val;
			} else if (val > max) {
				max = val;
			}
		}
		System.out.printf("max=%d\n", max);
		System.out.printf("min=%d\n", min);
	}
}
