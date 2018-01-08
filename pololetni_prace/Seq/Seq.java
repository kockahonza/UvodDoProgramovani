public class Seq {
	public static void main(String args[]) {
		String separator = " ";
		int headstart = 0;
		if ("-s".equals(args[0])) {
			separator = args[1];
			headstart = 2;
		}

		int start = -1;
		int step = -1;
		int end = -1;
		switch (args.length - headstart) {
			case 1:
				start = 1;
				step = 1;
				end = Integer.parseInt(args[headstart]);
				break;
			case 2:
				start = Integer.parseInt(args[headstart]);
				step = 1;
				end = Integer.parseInt(args[headstart + 1]);
				break;
			case 3:
				start = Integer.parseInt(args[headstart]);
				step = Integer.parseInt(args[headstart + 1]);
				end = Integer.parseInt(args[headstart + 2]);
				break;
		}

		for (int i = start; (step > 0) ? i <= end : i >= end; i += step) {
			if (!((step > 0) ? i + step <= end : i + step >= end)) {
				System.out.printf("%d", i);
				break;
			}
			System.out.printf("%d%s", i, separator);
		}
		System.out.println();
	}
}
