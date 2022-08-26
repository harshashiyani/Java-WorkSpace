
public class Swap {
	public static void main(String[] args) {
		int a=5;
		int b=9;
		System.out.print("before Swaping: ");
		System.out.print(a);
		System.out.println(b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("After Swaping: ");
		System.out.print(a);
		System.out.print(b);
	}
}
