public class Uloha2 {
	public static void main(String[] args) {
		int maxl;
		if (args[0] != null) {
			maxl = Integer.parseInt(args[0]);
		} else {
			maxl = 4;
		}


		System.out.print("0 ");
		for (int i = 3; i < 30; i = i + 3) {
			System.out.printf("%d ", i);
			if ((i / 3) % maxl == 0) {
				System.out.print("\n");
			}
		}
	}
}
