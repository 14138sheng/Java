package class4;

import java.util.Scanner;

public class Demo19 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ÇëÊäÈë1£º");
		int a = s.nextInt();
		System.out.println("ÇëÊäÈë2£º");
		int b = s.nextInt();
		System.out.println("ÇëÊäÈë3£º");
		int c = s.nextInt();
		System.out.println("ÇëÊäÈë4£º");
		int d = s.nextInt();
		if(a>b && a>c && a>d) {
			System.out.println(a);
		}else if(b>a && b>c && b>d) {
			System.out.println(b);
		}else if(c>a && c>b && c>d) {
			System.out.println(c);
		}else if(d>a && d>b && d>c) {
			System.out.println(d);
			}
		}
}

