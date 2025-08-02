public class StringBuilderExample {
	public static void main(String args[]) {
		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("Hello");
		StringBuilder sb3 = new StringBuilder("Hello");
		StringBuilder sb4 = new StringBuilder("Hello");
		StringBuilder sb5 = new StringBuilder("Hello");
		sb1.append("World");
		sb2.insert(5,"World");
		sb3.delete(0,5);
		sb4.replace(0,4,"Hi");
		sb1.reverse();
		System.out.println("append"+" "+sb1);
		System.out.println("insert"+" "+sb2);
		System.out.println("delete"+" "+sb3);
		System.out.println("replace"+" "+sb4);
		System.out.println("reverse"+" "+sb5);
	}
}
