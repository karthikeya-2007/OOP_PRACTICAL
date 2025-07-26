import java.util.Scanner;
public class incrementDecrement {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result1, result2;
		System.out.println("Value of a: "+ a);
		result1 = ++a;
		System.out.println("After Increament: "+ result1);
		System.out.println("Value of b: "+ b);
		result2 = --b;
		System.out.println("After Decrement: "+ result2);
	}
}