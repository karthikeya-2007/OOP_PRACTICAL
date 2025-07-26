import java.util.Scanner;
public class assignment {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int var;
		var = a;
		System.out.println("Var =: "+var);
		var +=a;
		System.out.println("Var +=: "+var);
		var -=a;
		System.out.println("Var -=: "+var);
		var *=a;
		System.out.println("Var *=: "+var);
		var /= a;
		System.out.println("Var /=: "+var);
	}
}