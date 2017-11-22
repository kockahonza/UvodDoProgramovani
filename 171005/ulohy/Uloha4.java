public class Uloha4 {
	public static void main(String[] args) {
		int x_inter = 170;
		int y_inter = 17;
		int thinkness = 21;
		
		String ss = "";

		for (int y = 0; y < y_inter + 2 * thinkness; y++) {
			for (int x = 0; x < x_inter + 2 * thinkness; x++) {
				if (thinkness - 1 < x && x < x_inter + thinkness && thinkness - 1 < y && y < y_inter + thinkness) {
					ss += " ";
				} else {
					ss += "X";
				}
			}
			ss += "\r\n";
		}
		System.out.print(ss);
	}
}
