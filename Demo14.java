package class3;

import java.util.Scanner;

public class Demo14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�����룺");
		int a = s.nextInt();
		int b = a/10000;
		int c = a/1000%10;
		int d = a/100%10;
		int e = a/10%10;
		int f = a%10;
		String max = b==f && c==e?"�ǻ�����":"���ǻ�����";
		System.out.println(max);
	}
}
