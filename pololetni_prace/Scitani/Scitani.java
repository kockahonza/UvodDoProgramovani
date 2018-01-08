import java.util.Random;

public class Scitani {
	public static void main(String args[]) {
		int n = 20;
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			int a = random.nextInt(21);
			int result = random.nextInt(21 - a) + a;
			int b = result - a;
			System.out.printf("%d + %d = %d\n", a, b, result);
		}
	}
}
