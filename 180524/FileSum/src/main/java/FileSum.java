import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.concurrent.*;

public class FileSum {
	public static class FileStats {
		private String filename;
		private int sum;
		public FileStats(String filename, int sum) {
			this.filename = filename;
			this.sum = sum;
		}
	}

	private static class GetSum implements Callable<FileStats> {
		String filename;
		public GetSum(String filename) {
			this.filename = filename;
		}
		@Override
		public FileStats call() throws IOException {
			int sum = 0;
			Scanner sc = new Scanner(Paths.get(this.filename));
			while (sc.hasNextDouble()) {
				sum += sc.nextDouble();
			}
			return new FileStats(filename, sum);
		}
		
	}
	public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		ArrayList<Future<FileStats>> vysledky = new ArrayList<Future<FileStats>>();
		for (String file : args) {
			vysledky.add(executor.submit(new GetSum(file)));
		}
		executor.shutdown();
		for (Future<FileStats> future : vysledky) {
			FileStats fs = future.get();
			System.out.printf("%s\t\t\t%d", fs.filename, fs.sum);
		}
	}
}
