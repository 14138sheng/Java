package class2;

public class Demo6 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		boolean c = a>b & a<b;
		System.out.println(c);
		System.out.println(!c);
		
		boolean d = a>b && a<b++;
		System.out.println(d);
		System.out.println(b);
		boolean e = a<b && a<b++;
		System.out.println(e);
		System.out.println(b);
	}
}
