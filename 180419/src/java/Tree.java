import java.io.File;

class TreeMaker {
	int dirCount = 0;
	int fileCount = 0;
	boolean onlyDirs = false;

	void printDir(File dir, String pre) {
		File[] fileList = dir.listFiles();

		for (int i = 0; i < fileList.length - 1; i++) {
			File file = fileList[i];
			if (file.isDirectory()) {
				System.out.printf("%s├──\033[33;1m%s\033[0m\n", pre, file.getName());
				this.dirCount += 1;
				printDir(file, pre + "│   ");
			} else {
				if (!onlyDirs) {
					System.out.printf("%s├──%s\n", pre, file.getName());
				}
				this.fileCount += 1;
			}
		}
		File file = fileList[fileList.length - 1];
		if (file.isDirectory()) {
			System.out.printf("%s└──\033[33;1m%s\033[0m\n", pre, file.getName());
			this.dirCount += 1;
			printDir(file, pre + "│   ");
		} else {
			if (!onlyDirs) {
				System.out.printf("%s└──%s\n", pre, file.getName());
			}
			this.fileCount += 1;
		}
	}

	public TreeMaker(String[] args) {
		if (args.length > 0) {
			if ("-d".equals(args[0])) {
				this.onlyDirs = true;
			}
		}
		File myRoot = new File("./");
		File[] folderList = myRoot.listFiles();
		System.out.printf("\033[33;1m%s\033[0m\n", myRoot.getName());
		printDir(myRoot, "");
		if (!onlyDirs) {
			System.out.printf("\n%d directories, %d files\n", dirCount, fileCount);
		} else {
			System.out.printf("\n%d directories\n", dirCount);
		}
	}
}

public class Tree {
	public static void main(String[] args) {
		System.out.println();
		new TreeMaker(args);
	}
}
