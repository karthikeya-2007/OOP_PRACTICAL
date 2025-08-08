import java.util.Scanner;
public class RepeatValueArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int value = sc.nextInt();
		int count = 0;
		for(int i=0;i<n;i++) {
			if(a[i] == value) {
				count++;
			}
		}
		System.out.println("The value "+ value+" is repeated for "+count+" times.");
	}
}