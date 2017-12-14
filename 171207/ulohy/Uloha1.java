import java.util.*;

class NumCluster {
	int known_num_index;
	Number[] nums;
	public NumCluster(int max_num_count) {
		known_num_index = 0;
		nums = new Number[max_num_count];
	}

	public void add_num(int num) {
		for (int i = 0; i < known_num_index; i++) {
			if (num == nums[i].num) {
				nums[i].count += 1;
				return;
			}
		}
		nums[known_num_index] = new Number(num);
		known_num_index += 1;
	}

	public void sort() {
		Arrays.sort(nums, new Comparator<Number>() {public int compare(Number num1, Number num2) { return Integer.valueOf(num1.num).compareTo(num2.num); }});
	}
}

class Number {
	int num;
	int count;
	public Number(int N) {
		num = N;
		count = 1;
	}

	public static void more() {
	}
}

public class Uloha1 {
	public static void main(String[] args) {
		int max_num_count = 500;
		NumCluster nc = new NumCluster(max_num_count);

		java.util.Scanner sc = new java.util.Scanner(System.in);
		for (int i = 0; i < max_num_count; i++) {
			if (!sc.hasNextInt()) {
				break;
			}
			nc.add_num(sc.nextInt());
		}

		for (int i = 0; i < nc.known_num_index; i++) {
			System.out.printf("%d ", nc.nums[i].num);
			System.out.println(nc.nums[i].count);
		}

		nc.sort();

		for (int i = 0; i < nc.known_num_index; i++) {
			System.out.printf("%d ", nc.nums[i].num);
			System.out.println(nc.nums[i].count);
		}
	}
}
