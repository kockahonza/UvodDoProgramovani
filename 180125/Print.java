import cz.alisma.alej.prog.pg16.QuadraticEquationGenerator;
import cz.alisma.alej.prog.pg16.QuadraticEquationPrinter;

interface QEPrinter extends QuadraticEquationPrinter {
	public void begin();
	public void end();
}

class TermPrint implements QEPrinter {
	public void begin() {
	}

	public void end() {
	}

	public void printEquation(int a, int b, int c, int x1, int x2) {
		System.out.printf("%dx² + %dx + %dc\n", a, b, c);
	}
}

class HTMLPrint implements QEPrinter {
	public void begin() {
		System.out.print("<html>\n\t<head></head>\n\t<body>\n");
	}

	public void end() {
		System.out.print("\t</body>\n</html>\n");
	}

	public void printEquation(int a, int b, int c, int x1, int x2) {
		System.out.printf("\t\t%dx<sup>2</sup> + %dx + %d = 0\n", a, b, c);
	}
}
public class Print {
	public static void main(String[] args) {
		TermPrint printer = new TermPrint();

		printer.begin();
		QuadraticEquationGenerator.generate(10, printer);
		printer.end();
	}
}

