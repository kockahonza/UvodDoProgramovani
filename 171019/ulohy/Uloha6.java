public class Uloha6 {
	public static void main(String[] args) {
		double min = 2147483647;
		double max = -2147483648;
		double sum = 0;
		double sum_2 = 0;
		double len = 0;
		double dev = 0;
        	java.util.Scanner sc = new java.util.Scanner(System.in);
        	while (sc.hasNextInt()) {
			int num = sc.nextInt();
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
			sum += num;
			sum_2 += num*num;
			len += 1;
        	}
		double avg = sum / len;
		if(len != 1) {
			dev = Math.sqrt((sum_2 - avg * avg * len)/(len - 1));
		}

        	System.out.printf("Největší je: %f\n", max);
        	System.out.printf("Nejmenší je: %f\n", min);
        	System.out.printf("Suma je: %f\n", sum);
        	System.out.printf("Len je: %f\n", len);
        	System.out.printf("Průměrná hodnota je: %f\n", avg);
        	System.out.printf("Standartní odchylka je: %f\n", dev);

	}
}

