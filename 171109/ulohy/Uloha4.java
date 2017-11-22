public class Uloha4 {
	public static double get_new_x(double S, double x) {
		double new_x = ((S / x) + x) / 2;
		return new_x;
	}

	public static void main(String[] args) {
		double S = Double.parseDouble(args[0]);
		double precision = Double.parseDouble(args[1]);
		double old_x = S / 2;
		double current_x = get_new_x(S, old_x);
		while (Math.abs(old_x - current_x) > precision) {
			// uncomment if tou want to see all steps
			// System.out.printf("%f - %f = %f\n", old_x, current_x, old_x - current_x);
			old_x = current_x;
			current_x = get_new_x(S, old_x);
		}
		System.out.println(current_x);
	}
}



