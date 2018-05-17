import java.util.*;
import java.io.*;
import java.nio.file.*;

public class NoVlakna {
	public static void main(String[] args) throws IOException {
		for (String file : args) {
			double x = avg(Paths.get(file));
			System.out.printf("%-20s %10.3f\n", file, x);
		}
	}
	public static int avg(Path path) throws IOException {
		int sum = 0;
		int len = 0;
		Scanner sc = new Scanner(path);
		while (sc.hasNextDouble()) {
			sum += sc.nextDouble();
			len += 1;
		}
		return sum / len;
	}
}
