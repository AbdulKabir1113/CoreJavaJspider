package Array;
import java.util.Scanner;

public class _31TransposeofMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();
		int col = sc.nextInt();

		int a[][] = new int[row][col];

		// Input Matrix
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		// Transpose Matrix
		for(int i = 0; i < col; i++) {
			for(int j = 0; j < row; j++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
