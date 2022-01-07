package class4;

import java.util.Scanner;

public class Demo20 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("ÇëÊäÈë£º");
	int a = s.nextInt();
	if(a>0 && a<=2) {
	System.out.println(10.5);
	}else if(a>=2) {
	int b = (a-2)*4;
	System.out.println(10.5+b);
	}
}
}