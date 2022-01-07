package class4;

public class Demo15 {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		int c = 30;
		if (c++ == 30 && (b = true)) {
			c++;
		}
		if ((a = false) || ++c == 33) {
			c++;
		}
		System.out.println("c="+c);
	}
}