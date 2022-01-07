package class4;

import java.util.Scanner;

public class Demo17 {
	public static void main(String[] args) {
		java.util.Scanner s = new Scanner(System.in);
		System.out.println("ÇëÊäÈë£º");
		int year = s.nextInt();
		if(year%4 == 0 && year%100 != 0 || year%400 == 0)
			System.out.println(year+"ÊÇÈòÄê");
	}
}
