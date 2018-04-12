import java.util.Scanner;

public class Uloha1 {
	static String newParagraph(String line, int lineLength) {
		int clen = 0;
		String out = "";
		
		Scanner sc = new Scanner(line);
		while (sc.hasNext()) {
			String w = sc.next();
			clen += w.length();

			if (clen >= lineLength) {
				out += "\n";
				clen = 0;
			}
			out += w;
			out += " ";
		}

		return out;
	}
	public static void main(String[] args) {
		int lineLength = 25;
		String currentParagraph = "";
		String out = "";

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String l = sc.nextLine();
			if (l.isEmpty()) {
				out += newParagraph(currentParagraph, lineLength);
				out += "\n\n";
				currentParagraph = "";
			} else {
				currentParagraph += l;
				currentParagraph += " ";
			}
		}
		out += newParagraph(currentParagraph, lineLength);

		System.out.println(out);
	}
}
