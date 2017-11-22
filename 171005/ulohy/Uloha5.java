public class Uloha5 {
	public static void main(String[] args) {
		for (int i = 1; i <= Math.sqrt(Integer.parseInt(args[0])); i++) {
			System.out.printf("%d ", i*i);
		}
	}
}
