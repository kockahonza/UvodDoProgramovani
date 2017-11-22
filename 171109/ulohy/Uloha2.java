public class Uloha2 {
	public static double factorial(int x) {
		double rslt = 1;
		for (int i = 2; i <= Math.abs(x); i++) {
			rslt *= i;
		}
		return rslt * (x / Math.abs(x));
	}
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int k = Integer.parseInt(args[1]);
		if (k > n) {
			System.out.println("Invalid input");
			return;
		}
		System.out.println(factorial(n) / (factorial(k) * factorial(Math.abs(k - n))));
	}
}

