
class Game {
	int[] field;
	int[] jumpDists;
	int runCount;
	public Game(int fieldLength, int[] jumpDists) {
		field = new int[fieldLength];
		field[0] = 0;
		for (int i = 1; i < fieldLength; i++) { 
			field[i] = -1;
		}
		this.jumpDists = jumpDists;
		runCount = 0;
	}

	public void jump() {
		for (int i = 0; i < field.length; i++) {
			if (field[i] == runCount) {
				for (int o = 0; o < jumpDists.length; o++) {
					try {
						if (field[i - jumpDists[o]] == -1) {
							field[i - jumpDists[o]] = runCount + 1;
						}
					} catch (java.lang.ArrayIndexOutOfBoundsException e) {
					}
					try {
						if (field[i + jumpDists[o]] == -1) {
							field[i + jumpDists[o]] = runCount + 1;
						}
					} catch (java.lang.ArrayIndexOutOfBoundsException e) {
					}
				}
			}
		}
		runCount++;
	}

	public void render() {
		while (true) {
			boolean done = true;
			for (int i = 0; i < field.length; i++) {
				if (field[i] == -1) {
					done = false;
					break;
				}
			}
			if (done) {
				break;
			}
			jump();
		}
	}

	public void print() {
		for (int i = 0; i < field.length; i++) { 
			if (field[i] == -1) {
				System.out.print(" - ");
			} else {
				System.out.printf(" %d ", field[i]);
			}
		}
		System.out.println();
	}
}

public class Uloha1 {
	public static void main(String[] args) {
		int[] jj = {3, 5, 6, 7, 2};
		Game game = new Game(50, jj);
		game.print();
		game.render();
		game.print();
	}
}
