import java.io.IOException;
import java.io.FileReader;

public class NejdelsiRadek {
	public static void main(String[] args) throws IOException {
		java.util.List<String> lines = new java.util.LinkedList<String>();
		for (int i = 0; i < args.length; i++) {
			try {
				java.util.Scanner sc = new java.util.Scanner(new FileReader(args[i]));
				while (sc.hasNextLine()) {
					lines.add(sc.nextLine());
				}
			} catch (IOException e) {
				System.out.println("On of the files does not exist");
			}
		}
		String ls = new String();
		for (String line : lines) {
			if (line.length() > ls.length()) {
				ls = line;
			}
		}
		System.out.println(ls);
	}
}

