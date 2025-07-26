import java.util.Scanner;
public class bitwise2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		c = a^b;
		System.out.println("a^b="+ c);
		c = ~a;
		System.out.println("~a="+ c);
		c = a<<2;
		System.out.println("a<<2="+ c);
		c = a>>2;
		System.out.println("a>>2="+ c);
		c = a>>>2;
		System.out.println("a>>>2="+ c);
	}
}