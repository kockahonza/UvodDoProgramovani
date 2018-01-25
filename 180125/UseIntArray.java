// Ukázka použití.
public class UseIntArray {
	public static void main(String[] args) {
		// Proměnná je typu interface
		// Vložím do ní implementaci
		IntArray arr = new StupidIntArray(10);
 
		arr.add(5);
		arr.add(7);
 
		for (int i = 0; i < arr.size(); i++) {
		System.out.printf("%d\n", arr.get(i));
		}
	}
}
