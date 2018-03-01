public class Playfair {
	public static String encrypt(String input) {
		return new String();
	}
	public static boolean valInArray(char[] array, char chr) {
		for (int i = 0; i < array.length; i++) {
			if (chr == array[i]) {
				return true;
			}
		}
		return false;
	}
	public static int indexOfVal(char[] array, char chr) {
		for (int i = 0; i < array.length; i++) {
			if (chr == array[i]) {
				return i;
			}
		}
		return -1;
	}
	public static char[][] genKeyMatrix(String keyString) {
		char[] key = new char[25];
		int count = 0;
		for (int i = 0; i < keyString.length(); i++) {
			char ichr = keyString.charAt(i);
			if (ichr == 'J') { ichr = 'I'; }
			if (!valInArray(key, ichr)) {
				key[count] = ichr;
				count++;
			}
		}
		String legend = "ABCDEFGHIKLMNOPQRSTUVWXYZ";
		for (int i = 0; count < key.length; i++) {
			char ichr = legend.charAt(i);
			if (ichr == 'J') { ichr = 'I'; }
			if (!valInArray(key, ichr)) {
				key[count] = ichr;
				count++;
			}
		}
		char[][] keyMatrix = new char[5][5];
		for (int i = 0; i < key.length; i++) {
			keyMatrix[i / 5][i % 5] = key[i];
		}
		return keyMatrix;
	}
	public static String encrypt(char[][] keyMatrix, String message) {
		String cipher = new String();
		message = message.toUpperCase();
		System.out.println(message);
		for (int i = 0; i < message.length(); i += 2) {
			char m1 = message.charAt(i);
			char m2;
			char c1 = ' ';
			char c2 = ' ';
			try {
				m2 = message.charAt(i + 1);
			} catch (java.lang.StringIndexOutOfBoundsException e) {
				message += 'X';
				m2 = message.charAt(i + 1);
			}
			if (m1 == m2) {
				m2 = 'X';
				message = message.substring(0, i + 1) + 'X' + message.substring(i + 1);
			}
			int[] m1i = new int[2];
			int[] m2i = new int[2];
			int[] c1i = new int[2];
			int[] c2i = new int[2];
			System.out.printf("%c%c\n", m1, m2);
			for (int o = 0; o < keyMatrix.length; o++) {
				for (int p = 0; p < keyMatrix[0].length; p++) {
					if (keyMatrix[o][p] == m1) {
						m1i[0] = o;
						m1i[1] = p;
					}
					if (keyMatrix[o][p] == m2) {
						m2i[0] = o;
						m2i[1] = p;
					}
				}
			}
			System.out.printf("[%d, %d], [%d, %d]\n", m1i[0], m1i[1], m2i[0], m2i[1]);
			if (m1i[0] == m2i[0]) {
				c1 = keyMatrix[m1i[0]][(m1i[1] + 1) % 5];
				c2 = keyMatrix[m2i[0]][(m2i[1] + 1) % 5];
			} else if (m1i[1] == m2i[1]) {
				c1 = keyMatrix[m1i[1] + 1 % 5][m1i[0]];
				c2 = keyMatrix[m2i[1] + 1 % 5][m2i[0]];
			}
			System.out.printf("%c%c\n", c1, c2);
		}
		System.out.println(message);

		return cipher;
	}
	public static String decrypt(char[][] keyMatrix, String cipher) {
		String message = new String();

		return message;
	}
	public static void printMatrix(char[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int o = 0; o < matrix[0].length; o++) {
				System.out.printf("|%c|", matrix[i][o]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		String key = args[0].toUpperCase();
		String message = "HBDM";

		char[][] keyMatrix = genKeyMatrix(key);

		printMatrix(keyMatrix);

		encrypt(keyMatrix, message);
	}
}
