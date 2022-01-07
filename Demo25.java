package class5;

import java.util.Scanner;

public class Demo25 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("ÇëÊäÈëa:");
	int a = s.nextInt();
	Scanner s1 = new Scanner(System.in);
	System.out.println("ÇëÊäÈëb:");
	int c = 0;
	int b = s1.nextInt();
	if(a>=b) {
		c = b;
		b = a;
		a = c;
		System.out.println("a="+a+"\nb="+b);
	}else {
		System.out.println("a="+a+"\nb="+b);
	}
}
}
