import java.util.Scanner;
public class ReplaceValueArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int oldValue = sc.nextInt();
		int newValue = sc.nextInt();
		for(int i=0;i<n;i++) {
			if(a[i] == oldValue) {
				a[i] = newValue;
			}
		}
		System.out.println("Updated Array is: ");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]+"");
		}
	}
}