public class SloupcovyGraf {
	public static void main(String[] args) {
		int image_height = 720; // vyska vysledneho obrazku
		int image_width = 3000; // sirka vysledneho obrazku
		float freespace_width_ratio = 0.0f; // cast sirky kterou budou zabirat mezeri mezi sloupci
		int max_len = 1000; // maximalni pocet prvku

		int len = -1;
		int[] array = new int[max_len];
		int max_num = -2147483648;
		int min_num = 2147483647;
		java.util.Scanner sc = new java.util.Scanner(System.in);

		for (int i = 0; i < max_len; i++) {
			if (!sc.hasNextInt()) {
				len = i;
				break;
			}
			int val = sc.nextInt();
			array[i] = val;
			if (val > max_num) {
				max_num = val;
			}
			if (val < min_num) {
				min_num = val;
			}
		}

		int rect_width = (int) (((1 - freespace_width_ratio) * image_width) / len);
		int freespace_width = (int) ((freespace_width_ratio * image_width) / (len + 1));
		int rect_offset = (int) (image_width / (len + 1));

		int zero_level = -1;
		if (min_num < 0 && max_num > 0) {
			zero_level = (int) (( (double) max_num / (max_num - min_num)) * image_height);
		} else if (max_num > 0) {
			zero_level = image_height;
		} else {
			zero_level = 0;
		}
		int max_pos_rext_height = zero_level;
		int max_neg_rext_height = image_height - zero_level;

		System.out.printf("<html>\n");
		System.out.printf("<svg width=\"%d\" height=\"%d\">\n", image_width, image_height);
		for (int i = 0; i < len; i++) {
			int x = rect_width * i + freespace_width * (i + 1);
			int val = array[i];
			int y = -1;
			int height = -1;
			if (val > 0) {
				height = (int) (((double) val / max_num) * max_pos_rext_height);
				y = zero_level - height;
			} else {
				y = zero_level;
				height = (int) (((double) val / min_num) * max_neg_rext_height);
			}

			System.out.printf("    <rect x=\"%d\" y=\"%d\" width=\"%d\" height=\"%d\"\n", x, y, rect_width, height);
			System.out.printf("        fill=\"Maroon\" />\n");
		}
		System.out.printf("</svg>\n");
		System.out.printf("</html>");
	}
}
