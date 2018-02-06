public class Rovnice {
	public static float[][] step(float[][] matrix, int k) {
		int n = matrix.length;
		for (int i = 1 + k; i < n; i++) {
			float f = matrix[i][k] / matrix[k][k];
			for (int o = k; o <= n; o++) {
				matrix[i][o] -= matrix[k][o] * f;
			}
		}
		return matrix;
	}
	public static void printMatrix(float[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int o = 0; o < matrix[i].length; o++) {
				System.out.printf("%f; ", matrix[i][o]);
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void printX(float[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.printf("x%d=%f\n", i + 1, x[i]);
		}
	}
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		float[][] matrix = new float[n][n+1];
		java.util.Scanner sc = new java.util.Scanner(System.in);
		for (int i = 0; i < n; i++) {
			for (int o = 0; o <= n; o++) {
				matrix[i][o] = sc.nextInt();
			}
		}

		float[] x = new float[n];
		int k = 0;
		for (int i = 0; i < n - 1; i++) {
			matrix = step(matrix, k);
			k++;
		}
		for (int i = n - 1; i >= 0; i--) {
			float sum = 0;
			for (int o = i; o < n - 1; o++) {
				sum += x[o + 1] * matrix[i][o + 1];
			}
			x[i] = (matrix[i][n] - sum) / matrix[i][i];
		}
		printX(x);
	}
}
