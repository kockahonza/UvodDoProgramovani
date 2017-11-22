public class Uloha2 {
	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);

		double D = b*b - 4*a*c;
		if (D < 0) {
			System.out.println("{}");
		} else {
			double x1 = (-b + Math.sqrt(D)) / (2 * a);
			double x2 = (-b - Math.sqrt(D)) / (2 * a);
			System.out.printf("{%f; %f}", x1, x2);
		}
	}
}
