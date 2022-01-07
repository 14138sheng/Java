package class6;

public class Demo28 {
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		while(a<=100) {
			if(a%2 == 0) {
			b+=a;
			}
			a++;
			}
			System.out.println(b);
	}
}
