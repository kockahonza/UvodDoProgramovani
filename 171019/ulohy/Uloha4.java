public class Uloha4 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);

		for (int i = 2; i <= num / 2 + 1; i++) {
			if (num % i == 0) {
				System.out.printf("Number is not prime because it can be divided by %d\n", i);
				return;
			}
		}
		System.out.println("Number is prime");
	}
}
