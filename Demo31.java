package class6;

public class Demo31 {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c = 1;
		do {
			b*=a;
			c+=b;
			a++;
			}while(a<=10);
			System.out.println(c);
	}
}