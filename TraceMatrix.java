import java.util.Scanner;
public class TraceMatrix {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m[][] = new int[n][n];
		int trace = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				m[i][j] = sc.nextInt();
				if(i==j) {
					trace += m[i][j];
				}
			}
		}
		System.out.println("Trace of the Matrix is: "+ trace);
	}
}