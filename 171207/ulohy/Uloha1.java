import java.util.*;

class NumCluster {
	Number[] nums;
	public NumCluster(int max_num_count) {
		nums = new Number[0];
	}

	public Number[] get_new_nums() {
		Number[] new_nums = new Number[nums.length + 1];
		for (int i = 0; i < nums.length; i++) {
			new_nums[i] = nums[i];
		}
		return new_nums;
	}

	public void add_num(int num) {
		for (int i = 0; i < nums.length; i++) {
			if (num == nums[i].num) {
				nums[i].count += 1;
				return;
			}
		}
		nums = get_new_nums();
		nums[nums.length - 1] = new Number(num);
	}

	public void sort() {
		Arrays.sort(nums, (n1, n2) -> n1.count - n2.count);
	}

	public void print() {
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d ", nums[i].num);
			System.out.println(nums[i].count);
		}
	}
}

class Number {
	int num;
	int count;
	public Number(int N) {
		num = N;
		count = 1;
	}
}

public class Uloha1 {
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

		nc.print();
		nc.sort();
		System.out.println("------------");
		nc.print();

	}
}
