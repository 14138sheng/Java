package class2;

public class Demo9 {
	public static void main(String[] args) {
		int a = 2021;
		String b;
		if (a%4 == 0 && a%100 != 0 || a%400 == 0)
			b = "ÊÇÈòÄê";
		else
			b = "²»ÊÇÈòÄê";
		System.out.println(b);
	}
}
