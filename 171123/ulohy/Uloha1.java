public class Uloha1 {
	public static void printLine(int min, int max, int val, int terminal_width) {
		double ratio = ((double) terminal_width) / Math.abs(max - min);
		int negative_length = (int) (-min * ratio + 0.5);
		int length = (int) (Math.abs(val) * ratio + 0.5);
		if (val < 0) {
			repeatChar(negative_length - length, ' ');
			repeatChar(length, '#');
			System.out.print('|');
		} else {
			repeatChar(negative_length, ' ');
			System.out.print('|');
			repeatChar(length, '#');
		}
		System.out.println();
	}
	public static void repeatChar(int length, char Char) {
		for (int i = 0; i < length; i++) {
			System.out.print(Char);
		}
	}
	public static void main(String[] args) {
		int terminal_width = 60;
		if (terminal_width % 2 == 0) {terminal_width -= 1;}
		int max_len = 100;
		int len = -1;
		int[] array = new int[max_len];
		int max_num = -2147483648;
		int min_num = 2147483647;
		java.util.Scanner sc = new java.util.Scanner(System.in);

		for (int i = 0; i < max_len; i++) {
			if (!sc.hasNextInt()) {
				len = i - 1;
				break;
			}
			int val = sc.nextInt();
			array[i] = val;
			if (val > max_num) {
				max_num = val;
			}
			if (val < min_num) {
				min_num = val;
			}
		}

		for (int i = 0; i < len + 1; i++) {
			printLine(min_num, max_num, array[i], terminal_width);
		}
	}
}
