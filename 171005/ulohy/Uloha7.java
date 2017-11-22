public class Uloha7 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);

		for (int i = 1; i <= a; i++) {
			for (int o = 1; o <= a - i; o++) {
				System.out.print(" ");
			}
			for (int o = 1; o <= i; o++) {
				System.out.print("X");
			}
			System.out.print("\n");
		}
	}
}
