package class4;

import java.util.Scanner;

public class Demo19 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("??????1??");
		int a = s.nextInt();
		System.out.println("??????2??");
		int b = s.nextInt();
		System.out.println("??????3??");
		int c = s.nextInt();
		System.out.println("??????4??");
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

