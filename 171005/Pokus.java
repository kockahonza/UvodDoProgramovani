public class Pokus {
	public static void main(String[] args) {
		int[] x = {0, 1};
		x[2] = 5;
		for(int i = 0; i<50; i++) {
			System.out.println(x[i]);
		}
	}
}
