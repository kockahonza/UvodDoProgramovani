public class Uloha3 {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}
}
