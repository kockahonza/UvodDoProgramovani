public class Uloha3 {
	public static void main(String[] args) {
		int c_max = -2147483648;
        	java.util.Scanner sc = new java.util.Scanner(System.in);
        	while (sc.hasNextInt()) {
			int num = sc.nextInt();
			if (num > c_max) {
				c_max = num;
			}
        	}
        	System.out.printf("Největší je: %d", c_max);
	}
}
