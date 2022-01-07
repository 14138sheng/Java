package class5;

import java.util.Scanner;

public class Demo21 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入：");
		int a = s.nextInt();
		switch(a) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期天");
			break;
		default:
			System.out.println("输入错误。。");
			break;
		}
}
}