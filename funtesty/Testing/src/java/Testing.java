import java.util.*;

public class Testing {
	public static void main(String[] args) {
		Integer[] ia = {1, 2, 3, 4};
		Character[] ca = {'a', 'b', 'e', 'h'};

		printMe(ia);
		printMe(ca);
	}
	// public static void printMe(int[] ia) {
		// for (int i: ia) {
			// System.out.print(i);
		// }
		// System.out.println();
	// }
	// public static void printMe(char[] ca) {
		// for (char i: ca) {
			// System.out.print(i);
		// }
		// System.out.println();
	// }
	public static <T> void printMe(T[] x) {
		for (T i: x) {
			System.out.println(i);
		}
	}
}
