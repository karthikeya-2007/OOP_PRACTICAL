import java.util.Scanner;
public class SumAvg {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		int avg = (int)sum/n;
		System.out.println(avg);
		System.out.println(sum);
	}
}