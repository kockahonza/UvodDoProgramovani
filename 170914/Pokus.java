public class Pokus {
	public static void main(String[] args) {
		for (int i=30; i<47; i++){
			System.out.printf("\033[%dm", i);
			System.out.println("._____");
			System.out.println("|\\    \\");
			System.out.println("| \\ \\\\ \\");
			System.out.println("|  \\    \\");
			System.out.println("|   \"\"\"\"\"");
			System.out.println("`\"\"\"\"\"");
			System.out.printf("%d\n", i);
		}
	}
}
