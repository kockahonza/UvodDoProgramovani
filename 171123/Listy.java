public class Listy {
	public static void main(String[] args) {
		int n = 5;
		int[] a = new int[n];
		java.util.Scanner sc = new java.util.Scanner(System.in);

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = n - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}
}
