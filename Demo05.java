package class2;

public class Demo05 {
	public static void main(String[] args) {
		int a = 12345;
		int b = a/10000%10;
		int c = a/1000%10;
		int d = a/100%10;
		int e = a/10%10;
		int f = a%10;
		System.out.println(b+"\t"+c+"\t"+d+"\t"+e+"\t"+f);
	}
}
