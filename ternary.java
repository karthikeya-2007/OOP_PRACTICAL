import java.util.Scanner;
public class ternary {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int febDays = sc.nextInt();
		String result;
		result = (febDays == 28) ? "Not a leap year" : "Leap year";
		System.out.println(result) ;
	}
}