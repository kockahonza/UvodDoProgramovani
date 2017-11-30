public class Uloha1 {
	public static void repeatChar(int length, char Char) {
		for (int i = 0; i < length; i++) {
			System.out.print(Char);
		}
	}
	public static void main(String[] args) {
		int r = Integer.parseInt(args[0]);
		for (int y = (int) r; y >= -r; y--) {
			double x = Math.sqrt(r*r - Math.abs(y*y));
			repeatChar(r - (int) (x), ' ');
			repeatChar((int) (2 * x + 1), 'X');
			System.out.println();
		}
	}
}
