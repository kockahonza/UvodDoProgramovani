public class Uloha1 {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		String[] o = {"je", "neni"};
		System.out.printf("Cislo %d %s sude.\r\n", x, o[x % 2]);
	}
}
