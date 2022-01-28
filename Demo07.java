package class2;

public class Demo07 {
	public static void main(String[] args) {
		int a = 2021;
		
		boolean b = a%4==0;
		boolean c = a%100!=0;
		boolean d = a%400==0;
		String e = (b && c) || d?"是闰年":"不是闰年";
		System.out.println(e);
		
		String f = a%4==0 && a%100!=0 || a%400==0?"是闰年":"不是闰年";
		System.out.println(f);
	}
}
