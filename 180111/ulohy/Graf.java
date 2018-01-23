class Pomocne {
	public static void repeatChar(char Char, int len) {
		for (int i = 0; i < len; i++) {
			System.out.print(Char);
		}
	}
}

interface Grapher {
	void addData(int[] data, int max, int dataCount);
	void graph();
}

class GraphTerm implements Grapher {
	int[] data = new int[100];
	int max;
	int dataCount;
	int termWidth = 60;

	@Override
	public void addData(int[] data, int max, int dataCount) {
		this.data = data;
		this.max = max;
		this.dataCount = dataCount;
	}
	@Override
	public void graph() {
		double k = (float) termWidth / this.max;
		for (int i = 0; i < dataCount; i++) {
			Pomocne.repeatChar('#', (int) Math.round(k * this.data[i]));
			System.out.println();
		}
	}

	public GraphTerm(int[] data, int max, int dataCount) {
		this.addData(data, max, dataCount);
	}
}

class GraphSvg implements Grapher {
	
}

public class Graf {
	public static void main(String[] args) {
		int[] data = new int[100];
		int dataCount = 0;
		int max = 0;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		while (sc.hasNextInt()) {
			int num = sc.nextInt();
			if (num < 0) {
				continue;
			}
			data[dataCount] = num;
			if (num > max) {
				max = num;
			}
			 
			dataCount++;
			if (dataCount == data.length) {
				break;
			}
		}
		for (int i = 0; i < dataCount; i++) {
			System.out.println(data[i]);
		}
		GraphTerm g = new GraphTerm(data, max, dataCount);
		g.graph();
	}
}
