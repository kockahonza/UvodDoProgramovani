import java.util.*;
import java.io.*;
import java.nio.file.*;

public class Vlakna {
	private static class Vlakno extends Thread {
		Path path;
		double avg;
		public Vlakno(String file) throws IOException {
			this.path = Paths.get(file);
		}
		@Override
		public void run() {
			double sum = 0;
			double len = 0;
			try {
				Scanner sc = new Scanner(this.path);
				while (sc.hasNextDouble()) {
					sum += sc.nextDouble();
					len += 1;
				}
				avg = sum / len;
			} catch (IOException e) {
			}
		}
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		ArrayList<Vlakno> vlakna = new ArrayList<Vlakno>();
		for (String file : args) {
			vlakna.add(new Vlakno(file));
			vlakna.get(vlakna.size() - 1).start();
		}
		for (Vlakno vlakno : vlakna) {
			vlakno.join();
			System.out.printf("%s\t\t\t%f\n", vlakno.path, vlakno.avg);
		}
	}
}
