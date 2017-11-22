public class Uloha8 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]); // the highest number the table will multiply with
		int w = Integer.toString(a*a).length(); // width of a cell

		for (int i = 0; i < w * a + a + 1; i++) {
			System.out.print("-");
		}
		System.out.print("\n");

		for (int row = 1; row <= a; row++) {
			System.out.print("|");
			for (int col = 1; col <= a; col++) {
				int num = row * col;
				for (int o = 0; o < w - Integer.toString(num).length(); o++) {
					System.out.print(" ");
				}
				System.out.printf("%d|", num);
			}
			System.out.print("\n");
		}

		for (int i = 0; i < w * a + a + 1; i++) {
			System.out.print("-");
		}
		System.out.print("\n");
	}
}
