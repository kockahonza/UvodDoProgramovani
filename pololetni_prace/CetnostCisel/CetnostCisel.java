import java.util.*;

public class CetnostCisel {
	public static void main(String[] args) {
		int max_num_count = 22;
		NumCluster nc = new NumCluster(max_num_count);

		java.util.Scanner sc = new java.util.Scanner(System.in);
		for (int i = 0; i < max_num_count; i++) {
			if (!sc.hasNextInt()) {
				break;
			}
			nc.add_num(sc.nextInt());
		}

		nc.sort();
		System.out.println("------------");
		nc.print();

	}
}
