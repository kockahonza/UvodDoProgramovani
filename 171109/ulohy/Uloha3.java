public class Uloha3 {
	public static void repeatChar(char Char, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(Char);
		}
	}

	public static void printLine(char Char, int pre_freespace, int length) {
		printLine(Char, pre_freespace, length, pre_freespace);
	}

	public static void printLine(char Char, int pre_freespace, int length, int post_freespace) {
		for (int i = 0; i < pre_freespace; i++) {
			System.out.print(' ');
		}
		for (int i = 0; i < length; i++) {
			System.out.print(Char);
		}
		for (int i = 0; i < post_freespace; i++) {
			System.out.print(' ');
		}
	}

	public static void printBox(char Char, int height, int pre_freespace, int length) {
		printBox(Char, height, pre_freespace, length, pre_freespace);
	}

	public static void printBox(char Char, int height, int pre_freespace, int length, int post_freespace) {
		for (int i = 0; i < height; i++) {
			printLine(Char, pre_freespace, length, pre_freespace);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int vertical_length = Integer.parseInt(args[0]);
		int x_thickness = vertical_length;
		int horizontal_length = Math.round((vertical_length * 4.0f) / 3);
		int y_thickness = Math.round((vertical_length * 3.0f) / 4);
		printBox('X', vertical_length, horizontal_length, x_thickness);
		printBox('X', y_thickness, 0, horizontal_length * 2 + x_thickness);
		printBox('X', vertical_length, horizontal_length, x_thickness);
	}
}


