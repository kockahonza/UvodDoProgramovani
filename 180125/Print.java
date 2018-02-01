import cz.alisma.alej.prog.pg16.QuadraticEquationGenerator;
import cz.alisma.alej.prog.pg16.QuadraticEquationPrinter;
import java.util.Scanner;

interface QEPrinter extends QuadraticEquationPrinter {
	public void begin();
	public void end();
}

class TermPrinter implements QEPrinter {
	int[][] xs;

	public TermPrinter() {
		this.xs = new int[0][2];
	}

	public void addXs(int x1, int x2) {
		int[][] oldXs = xs;
		xs = new int[oldXs.length + 1][2];
		for (int i = 0; i < oldXs.length; i++) {
			xs[i] = oldXs[i];
		}
		this.xs[this.xs.length - 1][0] = x1;
		this.xs[this.xs.length - 1][1] = x2;
	}

	@Override
	public void begin() {
	}

	@Override
	public void end() {
		for (int i = 0; i < xs.length; i++) {
			System.out.printf("%d, %d\n", xs[i][0], xs[i][1]);
		}
	}

	@Override
	public void printEquation(int a, int b, int c, int x1, int x2) {
		addXs(x1, x2);
		if (a == 1) {
			System.out.print("x² ");
		} else {
			System.out.printf("%s%dx² ", (a < 0 ? '-' : ""), Math.abs(a));
		}
		if (b == 0) {} else if (b == 1) {
			System.out.print("x ");
		} else {
			System.out.printf("%s %dx ", (b < 0 ? '-' : "+"), Math.abs(b));
		}
		if (c == 0 || c == 1) {} else {
			System.out.printf("%s %d ", (c < 0 ? '-' : "+"), Math.abs(c));
		}
		System.out.println("= 0");
	}
}

class HTMLPrinter implements QEPrinter {
	int[][] xs;

	public HTMLPrinter() {
		this.xs = new int[0][2];
	}
	public void addXs(int x1, int x2) {
		int[][] oldXs = xs;
		xs = new int[oldXs.length + 1][2];
		for (int i = 0; i < oldXs.length; i++) {
			xs[i] = oldXs[i];
		}
		this.xs[this.xs.length - 1][0] = x1;
		this.xs[this.xs.length - 1][1] = x2;
	}

	@Override
	public void begin() {
		System.out.print("<html>\n\t<head></head>\n\t<body>\n");
	}

	@Override
	public void end() {
		for (int i = 0; i < xs.length; i++) {
			System.out.printf("\t\t%d, %d<br>\n", xs[i][0], xs[i][1]);
		}
		System.out.print("\t</body>\n</html>\n");
	}

	@Override
	public void printEquation(int a, int b, int c, int x1, int x2) {
		addXs(x1, x2);
		if (a == 1) {
			System.out.print("\t\tx<sup>2</sup> ");
		} else {
			System.out.printf("\t\t%s%dx<sup>2M/sup> ", (a < 0 ? '-' : ""), Math.abs(a));
		}
		if (b == 0) {} else if (b == 1) {
			System.out.print("x ");
		} else {
			System.out.printf("%s %dx ", (b < 0 ? '-' : "+"), Math.abs(b));
		}
		if (c == 0 || c == 1) {} else {
			System.out.printf("%s %d ", (c < 0 ? '-' : "+"), Math.abs(c));
		}
		System.out.println("= 0<br>\n");
	}
}

class TermPractise extends TermPrinter {
	@Override
	public void printEquation(int a, int b, int c, int x1, int x2) {
		if (a == 1) {
			System.out.print("x² ");
		} else {
			System.out.printf("%s%dx² ", (a < 0 ? '-' : ""), Math.abs(a));
		}
		if (b == 0) {} else if (b == 1) {
			System.out.print("x ");
		} else {
			System.out.printf("%s %dx ", (b < 0 ? '-' : "+"), Math.abs(b));
		}
		if (c == 0 || c == 1) {} else {
			System.out.printf("%s %d ", (c < 0 ? '-' : "+"), Math.abs(c));
		}
		System.out.println("= 0");
		System.out.println("Enter the two roots of the equation below:");
		Scanner s = new Scanner(System.in);
		int[] inp = new int[] {s.nextInt(), s.nextInt()};
		if (((inp[0] == x1) && (inp[1] == x2)) || ((inp[0] == x2) && (inp[1] == x1))) {
			System.out.println("Yap");
			return;
		}
		System.out.println("Nap");
	}
}

public class Print {
	public static void main(String[] args) {
		HTMLPrinter printer = new HTMLPrinter();

		printer.begin();
		QuadraticEquationGenerator.generate(10, printer);
		printer.end();
	}
}

