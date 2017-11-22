public class Uloha {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int width1 = Integer.toString(num1).length();
		int width2 = Integer.toString(num2).length();
		int max_width = Integer.toString(num1 * num2).length();
		for (int i = 0; i <= max_width - width1; i++) {
			System.out.print(" ");
		}
		System.out.println(num1);
		System.out.print("*");
		for (int i = 0; i <= max_width - width2 - 1; i++) {
			System.out.print(" ");
		}
		System.out.println(num2);
		for (int i = 0; i <= max_width; i++) {
			System.out.print("-");
		}
		System.out.println();
		int result = 0;
		for (int i = 1; i <= width2; i++) {
			int k = (int) Math.pow(10, i);
			// get current a
			int a = num2 % k;
			// calculate result for this a
			int mid_result = num1 * a;
			result += mid_result;
			mid_result = (mid_result * 10) / k;
			int mid_result_width = Integer.toString(mid_result).length();
			// print out this line
			for (int o = 0; o <= max_width - mid_result_width - i + 1; o++) {
				System.out.print(" ");
			}
			System.out.println(mid_result);
			// edit num2 for future reference
			num2 = (num2 / k) * k;
		}
		for (int i = 0; i <= max_width; i++) {
			System.out.print("-");
		}
		System.out.print("\n ");
		System.out.println(result);
	}
}
