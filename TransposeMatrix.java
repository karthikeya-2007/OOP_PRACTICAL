import java.util.Scanner;
public class TransposeMatrix {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int m[][] = new int[rows][cols];
		int t[][] = new int[cols][rows];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				m[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				t[j][i] = m[i][j];
			}
		}
		System.out.println("Transpose of the matrix is: ");
		for(int i=0;i<cols;i++) {
			for(int j=0;j<rows;j++) {
				System.out.print(t[i][j]+" ");
			}
		}
	}
}