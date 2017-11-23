public class Uloha2 {
	public static void main(String[] args) {
		int max_len = 100;
		int last_index = -1;
		int[] array = new int[max_len];

		java.util.Scanner sc = new java.util.Scanner(System.in);


		for (int i = 0; i < max_len; i++) {
			if (!sc.hasNextInt()) {
				last_index = i - 1;
				break;
			}
			array[i] = sc.nextInt();
		}

		for (int i = last_index; i >= -1; i--) {
			System.out.println(array[i]);
		}
	}
}
