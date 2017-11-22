public class Uloha {
	public static int doIt(int y, int m, int d) {
		int[] cal = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int total = 0;
		// account for the special year
		if ((y % 4) == 0) {
			cal[1] += 1;
		}
		try {
			// count all days from previous months (and make sure that if m > than allowed then return -1)
			for (int i = 1; i < m; i++) {
				total += cal[i - 1];
			}
			// count all days from this month days (and check if there are more then there should be)
			if (d > cal[m - 1]) {
				return -1;
			}
			total += d;
			return total;
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			return -1;
		}
	}
	public static void main(String[] args) {
		int result = doIt(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
		if (result == -1) {
			System.out.println("Invalid date");
			return;
		}
		System.out.println(result);
	}
}
