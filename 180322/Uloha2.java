import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;

public class Uloha2 {
	static String translate(String[][] legend, String inp) {
		for (int i = 0; i < legend.length; i++) {
			if (inp == legend[i][0]) {
				return legend[i][1];
			}
		}
		return inp;
	}

	static String[][] newLegend(String[][] legend, String in1, String in2) {
		String[][] nlegend = new String[legend.length + 1][2];
		for (int i = 0; i < legend.length; i++) {
			nlegend[i] = legend[i];
		}
		nlegend[nlegend.length - 1][0] = in1;
		nlegend[nlegend.length - 1][1] = in2;
		return nlegend;
	}

	static void printLegend(String[][] legend) {
		for (int i = 0; i < legend.length; i++) {
			System.out.printf("%s -- %s\n", legend[i][0], legend[i][1]);
		}
	}

	public static void main(String[] args) throws IOException {
		String[][] legend = new String[0][2];
		Scanner sc = new Scanner(new FileReader(args[0]));
		while (sc.hasNextLine()) {
			String[] newData = sc.nextLine().split(" ");
			legend = newLegend(legend, newData[0], newData[1]);
		}
		printLegend(legend);
		String[] out = new String[args.length - 2];
		for (int i = 0; i <= args.length; i++) {
			out[i] = translate(legend, args[i + 1]);
			System.out.printf("%s ", out[i]);
		}
	}
}
