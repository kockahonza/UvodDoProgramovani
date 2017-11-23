import java.util.ArrayList;
import java.util.List;

public class Uloha3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		java.util.Scanner sc = new java.util.Scanner(System.in);


		while (sc.hasNextInt()) {
			list.add(sc.nextInt());
		}

		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
	}
}
